package Module23_OPPS.ClassesAndObject;

class Car{
    static boolean live = true;
    static String color;
    int money = 120000000;
    int speed;
    Car(){
        System.out.println("Hello constructor called after creating the object");
    }

    static void work(){
        System.out.println();
    }

}

class Main{
    static int age = 10;
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.live = false);
        Car c2 = new Car();
        System.out.println(c2.live);

        System.out.println(Car.live);
        System.out.println(age);
        System.out.println(Car.color);
    }
}
