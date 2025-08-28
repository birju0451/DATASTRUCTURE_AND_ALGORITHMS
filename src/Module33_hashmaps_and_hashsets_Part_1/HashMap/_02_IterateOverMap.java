package Module33_hashmaps_and_hashsets_Part_1.HashMap;
import  java.util.HashMap;
public class _02_IterateOverMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Amit",34);
        map.put("Birju",54);
        map.put("manish",74);
        map.put("Ayaush",74);
        map.put("Amrit",74);
        map.put("Birju",65);


        //Print all the key of the set
        System.out.println("Print all the key of the set");
        for(String key : map.keySet()){
            System.out.println(key);
        }
        //print all the value of the set
        System.out.println("print all the value of the set");
        System.out.println(map.get("Amit"));//34 ->we can access the value by the help of  key
        for(String key : map.keySet()){
            System.out.println(map.get(key));
        }
        //print both together
        System.out.println("print both together");
        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key+" "+val);
        }

        //try to print value without using key
        for(int val : map.values()){
            System.out.println(val);
        }

        for (Object pair : map.entrySet()){
            System.out.println(pair);
        }


    }
}
