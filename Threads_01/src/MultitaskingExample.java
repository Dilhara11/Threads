public class MultitaskingExample {
    public static void main(String[] args) {
        FileDownloader downloader = new FileDownloader();
        Thread progressBar = new Thread(new ProgressBarUpdater());

        downloader.start(); //start downloading
        progressBar.start(); //start updating progress bar
    }
}
