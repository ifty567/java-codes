public class Constructor {
   
    public static class Student{
        String name;
        int roll;
        public Student(String n , int r){
            name = n;
            roll= r;
            System.out.println("hi "+name+" , your roll is "+roll);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("ifty", 1);//object
        Student s2 = new Student("mahim", 20);
    }
}
