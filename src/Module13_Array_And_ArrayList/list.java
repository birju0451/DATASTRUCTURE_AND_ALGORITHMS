package Module13_Array_And_ArrayList;

import java.util.*;

public class list {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>();
        num.add(7);
        num.add(4);
        num.add(7);
        num.add(5);
        num.add(9);


        for(int ele:num){
            System.out.println(ele);
        }
    }
}
