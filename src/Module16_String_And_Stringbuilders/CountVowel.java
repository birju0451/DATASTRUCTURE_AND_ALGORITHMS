package Module16_String_And_Stringbuilders;

public class CountVowel {
    public static void main(String[] args) {
        String s ="Raghav garg is a teacher. A";
        s= s.toLowerCase();
        char ch;
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u' ){
                count++;
            }
        }
        System.out.println(count);
    }
}
