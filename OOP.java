class Shape{
    String dim;

}

class Shape2D extends Shape{
     String type="2d";
}
class Shape3D extends Shape{
    String type="3d";
}
public class OOP {
    public static void main(String[] args) {
        Shape3D s1=new Shape3D();
         s1.dim="3d";
         System.out.println(s1.type);
    }
}
