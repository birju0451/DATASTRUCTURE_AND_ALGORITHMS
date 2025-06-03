package Module15_Strings;

public class totlalCount {
    public static void main(String[] args) {
        String s="hello java";
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!= ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
