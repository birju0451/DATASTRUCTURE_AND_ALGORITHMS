package Module33_hashmaps_and_hashsets_Part_1.HashMap;

import java.util.HashMap;

public class _03_Valid_anagaram {
    public static void main(String[] args) {
        String s = "anagram",t = "nagaram";
        if(s.length() != t.length()) {
            System.out.println("This is not anagram");
            return;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char key = s.charAt(i);
            if(!map1.containsKey(key)){
                map1.put(key,1);
            }else{
                map1.put(key,map1.get(key)+1);
            }
        }
        System.out.println(map1);
        for(int i = 0;i<t.length();i++){
            char key = t.charAt(i);
            if(!map2.containsKey(key)){
                map2.put(key,1);
            }else{
                map2.put(key,map2.get(key)+1);
            }
        }
        System.out.println(map2);
        boolean ans = true;
        for(char key:map1.keySet()){
            if(map1.get(key).equals(map2.get(key))){
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
