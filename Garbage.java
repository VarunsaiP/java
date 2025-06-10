public class Garbage {
    Garbage() {
        System.out.println("Object created.");
    }

    // Finalize method (called before garbage collection)
    @Override
    protected void finalize() {
        System.out.println("Object is being garbage collected.");
    }

    public static void main(String[] args) {
        Garbage obj1 = new Garbage();
        Garbage obj2 = new Garbage();

        // Making objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Requesting garbage collection
        System.gc();
    }
}
