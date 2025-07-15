public class IllegalArgumentDemo {
    public static void main(String[] args) {
        try {
            Thread.sleep(-100); // Illegal argument: negative sleep time
        } catch (IllegalArgumentException | InterruptedException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }
}