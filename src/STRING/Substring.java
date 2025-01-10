package STRING;

public class Substring {
    public static void main(String[] args) {
        String s="abcd";
        System.out.println(s.substring(0));
        System.out.println(s.substring(1));
        System.out.println(s.substring(2));
        System.out.println(s.substring(3));
        System.out.println(s.substring(4));
        //System.out.println(s.substring(5));//Range [5, 4) out of bounds for length 4
        System.out.print(s.substring(0,s.length()));

    }
}
