package Module23_OPPS.Polymorphism;

class Animal{
    void sound(){
        System.out.println("Some sound");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    @Override
     protected void sound(){
        System.out.println("Meow");
    }
}

public class polymorphism{
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Animal();

        a1.sound();
        a2.sound();
        a3.sound();

        Cat c1 = new Cat();
        c1.sound();
    }
}