package Module23_OPPS.Constructor;
class Vehicle{
    Vehicle(){
        System.out.println("Vehicle constructor called :)");
    }
}
class Cars extends Vehicle{
    String brand;
    String model;
    int speed;

    Cars(){
        super();
    }
    Cars(String brand){
        this(brand,500);
    }

    Cars(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
        new Cars(brand,speed,"Wxy21");
    }

    Cars(String brand, int speed,String model){
        this.brand = brand;
        this.speed = speed;
        this.model = model;
    }

}

public class CallingFromOneToAnother{
    public static void main(String[] args) {
        Cars c1 = new Cars("bmw");
        System.out.println(c1.brand + " "+ c1.speed);
    }
}
