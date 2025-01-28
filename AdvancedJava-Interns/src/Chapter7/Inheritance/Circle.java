package Chapter7.Inheritance;

public class Circle extends Shape {

    public Circle(){
        this.length = 5;
    }
    public Circle(double r){
       super(r,0);
    }

    @Override
    public double getArea() {
        return  Math.round(Math.PI * Math.pow(this.length,2));
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * (Math.PI * this.length));
    }

    @Override
    public String display() {
        return  "====================================" +
                "\nDetails of " + this.getClass().getName() +
                "\nRadius: " + this.length +
                "\nArea: " + this.getArea() +
                "\nPerimeter: " + this.getPerimeter();
    }
}
