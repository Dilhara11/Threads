public class ProgressBarUpdater implements Runnable{
    @Override
    public void run() {
        System.out.println("Progress bar updating...");
        for (int i = 1; i <= 10; i++){
            System.out.println("Progress bar: " + (i * 10) + "%");
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Progress Bar Update Complete!");
    }
}
