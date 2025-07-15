public class NumberFormatDemo {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}
