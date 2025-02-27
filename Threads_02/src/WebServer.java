public class WebServer {
    public static void main(String[] args) {
        ThreadGroup clientGroup = new ThreadGroup("ClientThreads");

        //simulating multiple client connecting
        for(int i = 1; i <= 5; i++){
            new ClientHandler(clientGroup, "Client-" + i).start();
        }

        System.out.println("Total Active Clients: " + clientGroup.activeCount());

        // Simulating server shutdown after 3 seconds

        try {
            Thread.sleep(3000);
            System.out.println("Shutting down server...");
            clientGroup.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
