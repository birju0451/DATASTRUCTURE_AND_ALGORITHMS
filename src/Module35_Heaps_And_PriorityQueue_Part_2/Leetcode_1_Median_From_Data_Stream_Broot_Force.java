package Module35_Heaps_And_PriorityQueue_Part_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MedianFinder {
    List<Integer> arr = new ArrayList<>();
    public MedianFinder() {

    }

    public void addNum(int num) {
        arr.add(num);
    }

    public double findMedian() {
        Collections.sort(arr);
        int n = arr.size();
        if(n%2 != 2) return arr.get(n/2);
        else return (arr.get(n/2)+arr.get(n/2-1))/2.0;
    }
}
public class Leetcode_1_Median_From_Data_Stream_Broot_Force {
}
