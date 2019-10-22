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

        //中断线程池，可以看到queue中的等待数，执行过程就明白了
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
