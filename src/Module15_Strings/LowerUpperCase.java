package Module15_Strings;

public class LowerUpperCase {
    public static void main(String[] args) {
        String s="Raghav Garg is a teacher";

        System.out.println(s.toLowerCase());
        System.out.println(s);
        s.toLowerCase();//nothing will happen if I print s.
        System.out.println(s);//the output become-> Raghav Garg is a teacher.
        System.out.println("---------------");
        //if I store the sting then only change
        s =s.toLowerCase();
        System.out.println(s);
        System.out.println(s.toUpperCase());

        //concate()
        String a="xyz";
        String b="abc";
        a.concat(b);//->this is nothing
        System.out.println(a.concat(b));
        System.out.println(a);
        a=a.concat(b);
        System.out.println(a);
        System.out.println(b);
        b=b.concat(a);
        System.out.println(b);


    }
}
