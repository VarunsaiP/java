//import java.io.InputStream;
//import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class srm1 {
    public static void main(String[] args) throws IOException {
        byte b[]=new byte[10];
       PrintStream o=System.out;
        o.println("enter the values");
        int br=System.in.read(b);
       // String i=new String(b,0,br);
        //System.out.println("Input: "+i);
        o.println("Type: ");
        for(int i=0;i<br;i++){
            o.println((char)b[i]);
        }
        o.println();
    }
}