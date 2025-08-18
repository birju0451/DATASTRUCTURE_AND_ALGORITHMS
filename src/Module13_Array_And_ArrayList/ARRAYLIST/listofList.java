package Module13_Array_And_ArrayList.ARRAYLIST;
import java.util.*;
public class listofList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of lines
        List<List<Integer>> ans = new ArrayList<>(); // main list

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();  // numbers in this line
            List<Integer> arr = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                arr.add(sc.nextInt());
            }
            ans.add(arr); // add one row
        }
        System.out.println(ans);
    }
}
