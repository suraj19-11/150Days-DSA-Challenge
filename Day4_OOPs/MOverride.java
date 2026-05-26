public class MOverride {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        
    }
    
}

class Aniimal{
    void eat(){
        System.out.println("eating");
    }
}

class Cat extends Aniimal{
    void eat(){
        System.out.println("eating fish...");
    }
}