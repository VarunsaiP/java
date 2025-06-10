public class simplecal {
    public int add(int a, int b) {
        return a + b;
    }
}
    class singlecal extends simplecal{
        public void display() {
            System.out.println("this is a single level class");
        }
    }
    class tester{
        public static void main(String[]args){
            singlecal singlecal = new singlecal();
            singlecal.display();
            int sum= singlecal.add(25,10);
            System.out.println("Sum :"+sum);


        }

    }
