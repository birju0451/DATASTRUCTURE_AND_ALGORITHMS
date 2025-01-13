import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Whats ur name");
        String name=scanner.nextLine();
        System.out.println("Whats ur age");

        int age =scanner.nextInt();
        System.out.println("Whats ur food\n");
//        scanner.nextLine();
        String food=scanner.nextLine();
    }
}