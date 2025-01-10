package ARRAY2DIMENSIONAL;

import java.util.ArrayList;
import java.util.List;

public class ArratListTwoD {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(10);a.add(20);a.add(30);
        List<Integer> b=new ArrayList<>();
        b.add(40);b.add(50);
        List<Integer> c=new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        d.add(60);
        List<List<Integer>> l=new ArrayList<>();
        l.add(a);l.add(b);l.add(c);l.add(d);
        //this is work for one list
//        for(int i=0;i<a.size();i++){
//            System.out.print(a.get(i)+" ");
//        }


//        //this for work for list
//        /*
//        [10, 20, 30]
//        [40, 50]
//        []
//        [60]
//         */
//        for(int i=0;i<l.size();i++){
//            System.out.println(l.get(i));
//        }

//        //i want to excess 50 in list
//        System.out.println(l.get(1).get(1));

        // I want all the element in list
//        for (int i = 0; i <l.size() ; i++) {
//            List<Integer> x=l.get(i);
//            for(int j=0;j<x.size();j++){
//                System.out.print(x.get(j)+" ");
//            }
//            System.out.println();
//        }
        //or
        for(int i=0;i<l.size();i++){
            for (int j = 0; j < l.get(i).size(); j++) {
                System.out.print(l.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
