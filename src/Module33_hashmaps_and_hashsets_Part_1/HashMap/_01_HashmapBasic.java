package Module33_hashmaps_and_hashsets_Part_1.HashMap;

import java.util.HashMap;

public class _01_HashmapBasic {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Amit",34);
        map.put("Birju",54);
        map.put("manish",74);
        map.put("Ayaush",74);
        map.put("Amrit",74);
        map.put("Birju",65);

        System.out.println(map);
        System.out.println(map.containsKey("Amit"));
        System.out.println(map.containsValue(74));
        System.out.println(map.containsValue(54));

        System.out.println(map + " "+map.size());
        map.replace("Birju",65,100);
        System.out.println(map + " "+map.size());
    }
}
