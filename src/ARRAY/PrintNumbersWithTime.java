package ARRAY;

public class PrintNumbersWithTime {
    public static void main(String[] args) {
        // Record the start time
        long startTime = System.currentTimeMillis();

        // Print numbers from 1 to 1,000,000
        for (int i = 1; i <= 10000000; i++) {
            System.out.println(i);
        }

        // Record the end time
        long endTime = System.currentTimeMillis();

        // Calculate the elapsed time
        long totalTime = endTime - startTime;

        // Print the elapsed time in seconds
        System.out.println("Time taken to print from 1 to 1 million: " + (totalTime / 1000.0) + " seconds");
    }
}
