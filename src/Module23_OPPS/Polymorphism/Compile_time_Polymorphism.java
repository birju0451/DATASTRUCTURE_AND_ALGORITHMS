package Module23_OPPS.Polymorphism;
class Calculator{
    int add(int a,int b){
        return a+b;
    }

    double add(double a,double b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

    double add(int a,double b){
        return a+b;
    }

}
class AdvanceCal extends Calculator{
    int add(int a) {
        return a+5;
    }
}
public class Compile_time_Polymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        double result = cal.add(20.0,3.00000000009);

        System.out.printf("%.2f \n", result);

        AdvanceCal a = new AdvanceCal();

        System.out.println(a.add(6));
    }
}





