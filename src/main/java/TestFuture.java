import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestFuture {


    static ExecutorService executorService = Executors.newFixedThreadPool(4);

    public static void main(String[] args) {

        for(int i = 0; i < 10000 ; i++) {
            int finalI = i;
            executorService.submit(() -> {
                System.out.println("abc");
                System.out.println(finalI);
            });
        }

        executorService.shutdown();


        Future<String> hahaha = executorService.submit(() -> {
            System.out.println("hahaha");
            return "a";
        });
        String str = null;
        try {
            str = hahaha.get();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println(str);
        }


    }
}
