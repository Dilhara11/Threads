public class ClientHandler extends Thread{
    public ClientHandler(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is handling a client." );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " connection closed");
        }
    }
}
