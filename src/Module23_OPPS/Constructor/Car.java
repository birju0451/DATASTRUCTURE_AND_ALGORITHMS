package Module23_OPPS.Constructor;

public class Car {
    String color;
    int speed;
    Car(String color,int speed){
        this.color = color;
        this.speed = speed;
    }

    Car(Car c){
       this.color = c.color;
    }
}
class Main{
    public static void main(String[] args) {
        Car car = new Car("blue",231);
        System.out.println(car.color+","+car.speed);
        Car car1 = new Car(car);
        System.out.println(car1.color);
    }
}
