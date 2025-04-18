public class MethodOver {
    public static int sub(int a, int b){
        System.out.println("int");
        return a-b;
    }
    public static double  sub(double  a, double  b){
        System.out.println("double");
        return a-b;
    }
    public static void main(String[] args) {
        System.out.println(sub(60, 30));
        System.out.println(sub(90.9, 60));
    }
}
