package Module20_Recursion;

public class Functioncall2 {
    public static void mango(){
        System.out.println("Hii I am in mango");
    }
    public static void banana(){
        mango();
        System.out.println("Hii I am in banana");
    }
    public static void apple(){
        banana();
        System.out.println("Hii I am in apple");
        mango();
    }
    public static void main(String[] args) {
        System.out.println("Hii I am in Main Method");
        apple();
    }
}
