import java.util.concurrent.*;

public class TestFuture {


    static ExecutorService executorService = Executors.newFixedThreadPool(4);

    public static void main(String[] args) {


        final FutureTask<String> futureTask = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "hello";
            }
        });

        Thread thread = new Thread(futureTask);
        thread.start();


        String s = null;
        try {
            s = futureTask.get();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        } finally {
            System.out.println(s);
        }


        for (int i = 0; i < 10000; i++) {
            int finalI = i;
            executorService.submit(() -> {
                System.out.println("abc");
                System.out.println(finalI);
            });
        }

        // 中断线程池，可以看到queue中的等待数，执行过程就明白了
        // abcjava.util.concurrent.RejectedExecutionException: Task java.util.concurrent.FutureTask@4fca772d rejected from java.util.concurrent.ThreadPoolExecutor@9807454
        // [Shutting down, pool size = 4, active threads = 4, queued tasks = 6284, completed tasks = 3708]
        // 为了关闭在 ExecutorService 中的线程，你需要调用 shutdown() 方法。ExecutorService 并不会马上关闭，而是不再接收新的任务，壹但所有的线程结束执行当前任务，ExecutorServie 才会真的关闭。所有在调用 shutdown() 方法之前提交到 ExecutorService 的任务都会执行。
        // 如果你希望立即关闭 ExecutorService，你可以调用 shutdownNow() 方法。这個方法会尝试马上关闭所有正在执行的任务，并且跳过所有已经提交但是还没有运行的任务。
        // 但是对于正在执行的任务，是否能够成功关闭它是无法保证的，有可能他们真的被关闭掉了，也有可能它会壹直执行到任务结束。这是壹個最好的尝试。
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
