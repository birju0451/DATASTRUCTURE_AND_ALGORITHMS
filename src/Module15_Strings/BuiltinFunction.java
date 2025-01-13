package Module15_Strings;

public class BuiltinFunction{
    public static void main(String[] args) {
        //indexOf() and lastIndexOf()
        String s="Raghav Garg";
        System.out.println(s.indexOf('z'));
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));

        //compareTo()
        String a="abc";
        String b="dbc";
        System.out.println(a.compareTo(b));

        //contains()
        String c="physics wallah skills";
        System.out.println(c.contains("alla"));
        System.out.println(c.contains("slla"));

        //startWith()
        System.out.println(c.startsWith("phy"));
        System.out.println(c.endsWith("lls"));
    }
}
