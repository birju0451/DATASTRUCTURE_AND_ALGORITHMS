package Module23_OPPS.AcessModifier;
class Student {
    private String name;  // private variable

    // public setter
    public void setName(String name) {
        this.name = name;
    }

    // public getter
    public String getName() {
        showMessage();
        return name;
    }

    private void showMessage() {  // private method
        System.out.println("This is a private method!");
    }
}

public class _01_PrivateExample {
    public static void main(String[] args) {
        Student s = new Student();

        // s.name = "Birju";  ERROR: 'name' has private access in Student
        s.setName("Birju");   //  allowed
        System.out.println(s.getName()); //  allowed

        // s.showMessage();  ERROR: showMessage() has private access
    }
}
