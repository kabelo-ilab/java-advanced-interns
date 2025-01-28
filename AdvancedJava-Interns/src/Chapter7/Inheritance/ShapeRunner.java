package Chapter7.Inheritance;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape objShape = new Shape(8,7);
        System.out.println(objShape.display());

        MyRectangle objRec = new MyRectangle(25,35);
        System.out.println(objRec.display());

        Circle objCircle = new Circle(5);
        System.out.println(objCircle.display());

        Triangle objTriangle = new Triangle(5,3,3);
        System.out.println(objTriangle.display());
        
    }

}
