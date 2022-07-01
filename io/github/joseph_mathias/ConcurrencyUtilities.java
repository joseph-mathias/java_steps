import java.util.concurrent.Executor;

public class ConcurrencyUtilities{
    public static void main(String[] args) {
        executorInvoke();
        executorServiceInvoke();
    }

    private static void executorInvoke(){
        Executor executor = new Caller();
        executor.execute(() -> {
            System.out.println("Executor Example!")
        })
    }

    private static void executorServiceInvoke(){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(() -> {
            System.out.println("Executor service  example")
        })
    }
}

class Caller implements Executor{
    @Overide
    public void execute(Runnable runnable){
        runnable.run();
    }
}