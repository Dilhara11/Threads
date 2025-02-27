public class CustomerRequest implements Runnable{
    private String requestType;

    public CustomerRequest(String requestType) {
        this.requestType = requestType;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " processing: " + requestType);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted!");
        }
        System.out.println(Thread.currentThread().getName() + " completed: " + requestType);
    }


}
