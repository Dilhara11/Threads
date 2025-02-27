import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EcommerceSystem {
    public static void main(String[] args) {

        //creating thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // simulating multiple customer requests
        executor.execute(new CustomerRequest("Order Processing"));
        executor.execute(new CustomerRequest("Payment Handling"));
        executor.execute(new CustomerRequest("Inventory Update"));
        executor.execute(new CustomerRequest("Customer Support"));
        executor.execute(new CustomerRequest("Refund Processing"));

        //shutdown the executor after tasks are submitted
        executor.shutdown();

        try {
            //wait for all task to finish
            if (!executor.awaitTermination(10, TimeUnit.SECONDS))
                executor.shutdown(); // force shutdown if tasks exceed time limit
        }catch (InterruptedException e){
            executor.shutdownNow();
        }
    }
}
