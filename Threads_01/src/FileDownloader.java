public class FileDownloader extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is started");
        for (int i = 0; i <= 5; i++){
            System.out.println("Downloading..." + (i * 20) + "%");
//            try{
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        System.out.println("Download Complete");
    }
}


