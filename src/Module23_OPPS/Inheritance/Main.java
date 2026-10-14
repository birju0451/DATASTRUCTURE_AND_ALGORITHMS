package Module23_OPPS.Inheritance;

class Animal{
    void show(){
        System.out.println("Animal called :)");
    }
    private void eat(){
        System.out.println("Some animal eats fishes ");
    }
}
class Dog extends Animal{
    @Override
    protected void show(){
        System.out.println("Dog called :)");
    }

    private void eat(){
        System.out.println("Dog eats meals :)");
    }
}
class Cat extends Dog{
//    @Override
//    void show(){
//        System.out.println("Cat called : )");
//    }
//    @Override
//    void eat(){
//        System.out.println("Cat eats fish");
//    }
}

public class Main {
    public static void main(String[] args) {
        Cat animal = new Cat();
        animal.show();
        animal.;
    }
}

