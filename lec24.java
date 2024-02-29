
public class Lecture24 implements Runnable {

    @Override
    public void run() {
        // This code will be executed by the new thread
        System.out.println("This is running in a separate thread!");
        
        // You can add your specific task here

        try {
            Thread.sleep(2000); // Simulate some work
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the MyRunnable class
        Lecture24 myRunnable = new Lecture24();

        // Create a new Thread object and provide the MyRunnable instance
        Thread thread = new Thread(myRunnable);

        // Start the thread
        thread.start();

        // This code will run in the main thread
        System.out.println("This is running in the main thread!");
    }
}