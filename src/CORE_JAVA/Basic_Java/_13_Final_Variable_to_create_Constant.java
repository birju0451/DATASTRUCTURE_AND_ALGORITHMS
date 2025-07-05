package Basic_Java;
//program  to use final variable to crete constant
public class _13_Final_Variable_to_create_Constant {
    final static double PI=3.14159;
    public static void main(String[] args) {
        double r = 10.0,a;
        a=PI*r*r;
        System.out.println("Area of circle :"+ a);
    }
}
