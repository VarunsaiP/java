import java.io.PrintStream;
public class prntstrem {
    public static void main(String[] args) {
        PrintStream p=System.out;
        byte[] b ={72,105,108};
        p.write(b,0,b.length);
        p.println();
    }
}
