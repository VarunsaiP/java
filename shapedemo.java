import shape.*;
public class shapedemo {
    public static void main(String[]args){
        circle ci=new circle(5);
        rectangle ri=new rectangle(4,6);
        triangle tr=new triangle(3,7);

        System.out.println("circle area: "+ci.area());
        System.out.println("rectangle area: "+ri.area());
        System.out.println("triangle area:"+tr.area());

        }
    }

