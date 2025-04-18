class Dog{
  String name;
  int age;

}

class Animal extends Dog{
  String color;
  // String name;
 // int age;
}
class Object extends Dog{
    String type;
  // String name;
 // int age;
}
public class Inherit {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="monty";
        System.out.println(d1.name);
        Animal a1=new Animal();
        a1.name="monty";
        a1.color="brown";
        a1.age=24;
        System.out.println(a1.age);
        Object o1=new Object();
        o1.type="animal";
        o1.age=20;

    }
}
