package Module23_OPPS.Abstraction;

abstract class Shape{
    String color;

    Shape(String color){
        this.color = color;
    }

    //Abstract method
    abstract double area();

    //Concrete method
    void getColor(){
        System.out.println("Color" + color);
    }
}
class Circle extends Shape{
    int radius;

    Circle(String color,int radius){
        super(color);
        this.radius = radius;
    }

    double area(){
        return 3.14 * radius * radius;
    }
}
public class Abstraction{
    public static void main(String[] args) {
        Shape s = new Circle("Red",5);
        s.getColor();
        System.out.println("Area : "+s.area());
    }
}
