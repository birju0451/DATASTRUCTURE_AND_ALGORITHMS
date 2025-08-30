package Module34_Heaps_And_Queue;

import java.util.Arrays;

// Student class implements Comparable interface
// So each Student object knows how to compare itself with another Student
class Students implements Comparable<Students> {
    int rno;        // Roll Number
    double perc;    // Percentage
    String name;    // Student Name

    // Constructor
    Students(int rno, double perc, String name) {
        this.name = name;
        this.rno = rno;
        this.perc = perc;
    }

    // compareTo method decides the "natural ordering" of Students
    // You can change the return statement depending on what you want:
    // 1. Sort by roll number
    // 2. Sort by percentage
    // 3. Sort by name
    @Override
    public int compareTo(Students s) {
        // Example 1: Sort by roll number (ascending)
        // return this.rno - s.rno;

        // Example 2: Sort by percentage (ascending)
         return Double.compare(this.perc, s.perc);

        // Example 3: Sort by full name (dictionary order, case-sensitive)
        // return this.name.compareTo(s.name);
    }
}

public class _00_Custum_Compater {

    // Utility function to print Student details
    public static void print(Students[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].name + " ");
            System.out.print(arr[i].perc + " ");
            System.out.print(arr[i].rno + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create an array of Student objects
        Students[] s = new Students[4];
        s[0] = new Students(76, 89.5, "Raghav");
        s[1] = new Students(43, 34.3, "Manish");
        s[2] = new Students(72, 63.5, "Birju");
        s[3] = new Students(65, 35.3, "Krish");

        // Print array before sorting
        System.out.println("Before Sorting:");
        print(s);

        // Sort array using Arrays.sort() -> internally calls compareTo()
        Arrays.sort(s);

        // Print array after sorting
        System.out.println("\nAfter Sorting:");
        print(s);
    }
}
