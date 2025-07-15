public class trd1 extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[]args){
        trd1 t1=new trd1();
        t1.start();{
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            trd1 t2=new trd1();
            t2.start();
        }
    }

}
