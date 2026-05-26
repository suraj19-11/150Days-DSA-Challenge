public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
        d.walk();

        Cat m = new Cat();
        m.meow();
        m.walk();

        Tiger t = new Tiger();
        t.roar(); 
        t.walk();

        Human h = new Human();
        h.speak();
        h.walk();
    
        
    }
    
}

// Base class
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walking...");
    }
}
// Derived class
class Dog extends Mammal {
    void bark() {
        System.out.println("barking...");
    }
}


//Hierarchical Inheritance
class Cat extends Mammal {
    void meow() {
        System.out.println("meowing...");
    }
}

class Tiger extends Mammal {
    void roar() {
        System.out.println("roaring...");
    }
}

class Human extends Mammal {
    void speak() {
        System.out.println("speaking...");
    }
}