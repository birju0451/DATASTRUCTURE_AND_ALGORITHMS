package Module13_Array_And_ArrayList;

import java.util.*;

public class list {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(7);
        nums.add(4);
        nums.add(7);
        nums.add(5);
        nums.add(9);

        for(int ele:nums){
            System.out.println(ele);
        }
    }
}
