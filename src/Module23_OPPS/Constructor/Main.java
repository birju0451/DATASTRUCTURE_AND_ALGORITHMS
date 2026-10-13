package Module23_OPPS.Constructor;

class Student{
    String name;
    void display(){
        System.out.println(this.name);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Birju Kumar";

        Student s2 = new Student();
        s2.name = "Manish Kumar";

        s1.display();
        s2.display();
    }
}