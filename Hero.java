public class Hero {
    String name;

    Hero(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Hero Name: " + name);
    }
}

class Superhero extends Hero {
    String power;

    Superhero(String name, String power) {
        super(name); // Passing name to superclass
        this.power = power;
    }

    void display() {
        super.display(); // Calling superclass method
        System.out.println("Superpower: " + power);
    }
}

class HeroAcademy {
    public static void main(String[] args) {
        Superhero hero = new Superhero("Flash", "Super Speed");
        hero.display();
    }
}

