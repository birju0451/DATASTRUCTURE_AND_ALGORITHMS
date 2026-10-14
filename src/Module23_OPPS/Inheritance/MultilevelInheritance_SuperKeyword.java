package Module23_OPPS.Inheritance;

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void eat() {
        super.eat();
        System.out.println("Dog eats");
    }
}

class Puppy extends Dog {
    void eat() {
        super.eat();
        System.out.println("Puppy eats");
    }
}
public class MultilevelInheritance_SuperKeyword{

}
