package Chapter7.Inheritance;

public class Triangle extends Shape {
    private double side3;

    public Triangle(){
        super();
        this.side3 = 7;
    }

    public Triangle(double sideOne, double sideTwo, double sideThree){
        super(sideOne, sideTwo);
        this.side3 = sideThree;
    }

    @Override
    public double getArea() {
        return 0.5 * this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return this.length + this.width + this.side3;
    }

    @Override
    public String display() {
        return  "====================================" +
                "\nDetails of " + this.getClass().getName() +
                "\nBase: " + this.length +
                "\nHeight: " + this.width +
                "\nArea: " + this.getArea() +
                "\nPerimeter: " + this.getPerimeter();
    }
}
