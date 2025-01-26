import java.util.Scanner;
class pen{
    String color;
    String type;

    public void write(){
        System.out.println("write something");
    }
    public void  printtype(){
        System.out.println(this.type);
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}
public class Main {
    public static void main(String[] args) {
        pen pen1=new pen();
         pen1.color="red";
         pen1.type="gel";

         pen1.printcolor();
         pen1.printtype();
    }
}