package Module20_Recursion;

public class _01_FunctionCall {
    public static void mango(){
        System.out.println("Hii I am in mango");
    }
    public static void banana(){
        System.out.println("Hii I am in banana");
        mango();
    }
    public static void apple(){
        System.out.println("Hii I am in apple");
        banana();
    }
    public static void main(String[] args) {
        System.out.println("Hii I am in Main Method");
        apple();
    }
}
