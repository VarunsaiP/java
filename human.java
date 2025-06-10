class human {
    public void basicneed(){
        System.out.println("humans wants food ");
    }
}
class superhuman extends human{
    public void superneed(){
        System.out.println("superhuman need is power");

    }
}
class monkey extends human{
    public void specialneed(){
        System.out.println("monkey needs bananas");
    }
}
class kalki extends superhuman{
    public void fly(){
        System.out.println("kalik  is future savior");
    }
}
class herotable{
    public static void main(String[]args){
    kalki hero=new kalki();
    hero.basicneed();
    hero.superneed();
    hero.fly();

    monkey monkey=new monkey();
    monkey.specialneed();
    monkey.basicneed();

    }
}