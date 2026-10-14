package Module23_OPPS.Inheritance;

class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void bark() {
        System.out.println("Dog can bark");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();

        Dog dog = new Dog();
        dog.bark();
    }
}

