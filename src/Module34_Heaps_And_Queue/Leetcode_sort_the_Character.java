package Module34_Heaps_And_Queue;

import java.util.PriorityQueue;
//this is for a-Z only
public class Leetcode_sort_the_Character {
    public static void main(String[] args) {
        String s = "tree";
        PriorityQueue<Character> pq= new PriorityQueue<>();
        for (int i = 0; i < s.length(); i++) {
            pq.add(s.charAt(i));
        }
        StringBuilder  sb = new StringBuilder();
        while (pq.size()>0){
            sb.append(pq.remove());
        }
        System.out.println(sb);
    }
}
