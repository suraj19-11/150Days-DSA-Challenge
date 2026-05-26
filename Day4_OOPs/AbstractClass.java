public class AbstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        new Mustang();
        //Animal -> Horse -> Mustang


        
    }
    
}

abstract class Animal {
    String color;
    Animal() {
        System.out.println("Animal constructor called");
    }
    void eat() {
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }
    void changeColor() {
        color = "black";
    } 
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "white";
    }

    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

