package Module23_OPPS.Constructor;
class Animal{
    String name;
    int weight;

}
public class default_constructor {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        System.out.println(a1.name+" "+a1.weight);
        a1.name = "Dog";
        a1.weight = 15;
        System.out.println(a1.name+" "+a1.weight);
    }
}
