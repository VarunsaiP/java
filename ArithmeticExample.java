 class ArithmeticExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0; // This will cause an ArithmeticException

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
