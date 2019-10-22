import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestFixedThreadPool {




    public static void main(String[] args) {


        // ExecutorService es = Executors.newSingleThreadExecutor();
        ExecutorService es = Executors.newFixedThreadPool(4);
        System.out.println("begin");

        es.submit(()->{
            // System.out.println(1/0);
            System.out.println("2222");
            System.out.println("3333");
            System.out.println("3333");
            System.out.println("3333");
            System.out.println("3333");
            System.out.println("3333");
            System.out.println("3333");
            System.out.println("3333");
            System.out.println("3333");
            System.out.println("3333");
            System.out.println("3333");
            System.out.println("3333");
            System.out.println("3333");
            System.out.println("3333");
            System.out.println("3333");
            System.out.println("3333");
            System.out.println("3333");
            System.out.println("3333");
            System.out.println("3333");
            System.out.println("3333");

        });


        System.out.println("end");

    }
}
