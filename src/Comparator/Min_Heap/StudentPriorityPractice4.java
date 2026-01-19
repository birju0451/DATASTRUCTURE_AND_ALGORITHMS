package Comparator.Min_Heap;
import java.util.PriorityQueue;

public class StudentPriorityPractice4 {
    public static void main(String[] args) {

        Student s1 = new Student(1, 85);
        Student s2 = new Student(2, 90);
        Student s3 = new Student(3, 85);
        Student s4 = new Student(4, 70);
        Student s5 = new Student(5, 90);

        //✅ 4) Lower Marks first, Larger Roll first (MIN marks, MAX roll)
        PriorityQueue<Student> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a.marks != b.marks)
                        return a.marks - b.marks;   // lower marks first
                    return b.roll - a.roll;         // larger roll first
                }
        );


        pq.add(s1);
        pq.add(s2);
        pq.add(s3);
        pq.add(s4);
        pq.add(s5);

        System.out.println("Order of removing students:");

        while (!pq.isEmpty()) {
            Student s = pq.poll();
            System.out.println("Roll=" + s.roll + " Marks=" + s.marks);
        }
    }
}
