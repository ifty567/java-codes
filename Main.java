public class Main {
    public static class Student{
        String name;
        int roll;
        String section = "11A";
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "ifty";
        s1.roll = 1 ;
        // System.out.println(s1.name);
        Student s2 = new Student();
        s2.name = "mahim";
        s2.roll =2;
        Student s3 = new Student();
        s3.name ="mim";
        s3.roll=3;
        System.out.println(s3.section);
        
    }
}
