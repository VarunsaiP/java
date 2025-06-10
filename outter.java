public class outter {
    private String message = "Hello from Outer Class!";

    // Inner class
    class InnerClass {
        void display() {
            System.out.println(message); // Accessing outer class member
        }
    }
}
 class done {
    public static void main(String[] args) {
        outter outter = new outter();
        outter.InnerClass inner = outter.new InnerClass(); // Creating inner class object
        inner.display();
    }
}

