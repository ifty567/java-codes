class Employee{
   private int salary;
  public String name;
    void setSalary(int s){
        this.salary=s;
    }
    int getSalary(){
        return salary;
    }
}
public class Office {
    public static void main(String[] args) {
        Employee e1= new Employee();
        e1.setSalary(1000);
        System.out.println(e1.name);
        System.out.println(e1.getSalary());
    }
}
