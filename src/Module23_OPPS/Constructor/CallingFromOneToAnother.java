package Module23_OPPS.Constructor;
class Cars{
    String brand;
    int speed;

    Cars(){
        this("BMW",500);
    }

    Cars(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
}
public class CallingFromOneToAnother{
    public static void main(String[] args) {
        Cars c1 = new Cars();
        System.out.println(c1.brand + " "+ c1.speed);
    }
}
