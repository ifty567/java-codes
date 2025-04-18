class studente  {
    private int password;
    public int getpassword(){
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }

    void study(){//---->>method1
        System.out.println("Student is studying");
    }
    void study(int hours){//---->>method2
        System.out.println("Student is studying for " + hours + " hours");
    }
    void study(String subject){//---->>method3
        System.out.println("Student is studying " + subject);
    }
    void study(int hours, String subject){//---->>method4
        System.out.println("Student is studying " + subject + " for " + hours + " hours");
    }
    void study(String subject, int hours){//---->>method5
        System.out.println("Student is studying " + subject + " for " + hours + " hours");
    }

    }
    class Teacher extends studente{
        void study(){//---->>method
            System.out.println("Teacher is studying");
        }
        void study(int hours){//---->>method
            System.out.println("Teacher is studying for " + hours + " hours");
        }
        void study(String subject){//---->>method
            System.out.println("Teacher is studying " + subject);
        }
        void study(int hours, String subject){//---->>method
            System.out.println("Teacher is studying " + subject + " for " + hours + " hours");
        }
        void study(String subject, int hours){//---->>method
            System.out.println("Teacher is studying " + subject + " for " + hours + " hours");
        }
    

    }
public class MethodOverRiding {
    public static void main(String[] args) {
        studente s=new studente();
        s.study( 5,"4");
        Teacher t=new Teacher();
        t.study(5,"6");
        s.setPassword(1234);
        s.getpassword();
        System.out.println("password is:" + s.getpassword());
        
    
    }
    
}
