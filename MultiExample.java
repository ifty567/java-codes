
class StudentInfo {
    public String name;
    public int roll;

    public StudentInfo(int r, String n) {
        this.name = n;
        this.roll = r;
    }
}

public class MultiExample {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo(1, "mahim");
        System.out.println(s1.name); // Output: mahim
    }
}
