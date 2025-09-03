package Module35_Heaps_And_PriorityQueue_Part_2;

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    public MedianFinder() {

    }

    public void addNum(int num) {
        if(maxHeap.size() == 0) maxHeap.add(num);
        else{
            if(num<maxHeap.peek()) maxHeap.add(num);
            else minHeap.add(num);
        }
        //Balance the heap
        if(maxHeap.size() == minHeap.size()+2){
            minHeap.add(maxHeap.remove());
        }

        if(maxHeap.size()+2 == minHeap.size()){
            maxHeap.add(minHeap.remove());
        }
    }

    public double findMedian() {
        if(maxHeap.size() == minHeap.size()){
            return (maxHeap.peek()+minHeap.peek())/2.0;
        }else if(maxHeap.size()>minHeap.size()){
            return (double) maxHeap.peek();
        }else {
            return (double) minHeap.peek();
        }
    }
}
public class Leetcode_2_Meadian_From_Data_Stream_Best_Code {
    public static void main(String[] args) {
//        long[] ans = new int[10];
    }
}
