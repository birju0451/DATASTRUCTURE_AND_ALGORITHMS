interface A {
    void show();
}

interface B {
    void show();
}

class Test implements A, B {
    @Override
    public void show() {
        System.out.println("Test class method");
    }
}

public class Main {
    public static void main(String[] args) {
        Test obj = new Test();

        obj.show();
    }
}