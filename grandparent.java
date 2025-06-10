class grandparent {
    public void showgrandparent(){
        System.out.println("this is java's father");
    }
}
class parents extends grandparent{
    public void showparent(){
        System.out.println("HI Iam java");
    }
}
class child extends parents{
public void showchild() {
    System.out.println("HI iam java's son");
    }
}
class child2 extends parents{

    public void showchild2(){
        System.out.println("HI iam java's second child");
    }

}
class compiler{
    public static void main(String[]args){
        child obj= new child();
        child2 obj1 =new child2();
        obj.showgrandparent();
        obj.showparent();
        obj.showchild();
        obj1.showchild2();


    }

}

