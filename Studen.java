class Student{
    int rollnumber;
    String name;

    public Student(int r,String n) {
        this.rollnumber=r;
        this.name=n;
    }
    
}
public class MultiExample {
    public static void main(String[] args) {
        Student s1 =new Student(71, "ifty");
        System.out.println(s1.name);
    }
}