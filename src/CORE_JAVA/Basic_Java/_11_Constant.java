package Basic_Java;

public class _11_Constant {
    static final int NUMBER_OF_MONTH = 12;
    static final double PI=(double) 22/7;
    public static void main(String[] args) {
        //NUMBER_OF_MONTH=0; //This  will give error because I have declared  final .
        System.out.println(NUMBER_OF_MONTH);
        System.out.println(PI);
    }
}
