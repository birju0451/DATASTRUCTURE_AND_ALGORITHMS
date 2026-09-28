package CORE_JAVA;

public class test {
    public static void main(String[] args) {
        String s ="a2b3c4d1";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i=i+2){
            char ch = s.charAt(i);
            int occurance = s.charAt(i+1) - '0';// 0-> 48
            for (int j = 0; j <occurance; j++) {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
