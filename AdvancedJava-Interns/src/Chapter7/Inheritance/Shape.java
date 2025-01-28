package Chapter7.Inheritance;

public class Shape {
    protected double length, width;

    /**
     * Constructor to create a shape object with default values
     */
    public Shape(){
        this.length = 5;
        this.width = 7;
    }

    /**
     * Constructor to create a shape object with new length and width
     * @param l Length of the Shape
     * @param w Width of the Shape
     */
    public Shape(double l, double w) {
       setLength(l);
       setWidth(w);
    }

    /**
     * Get length of the Shape
     * @return The current length of the Shape
     */
    public double getLength() {
        return length;
    }

    /**
     * Change the length of the shape
     * @param length The new length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Get width of the Shape
     * @return The current width of the Shape
     */
    public double getWidth() {
        return width;
    }

    /**
     * Change the width of the Shape
     * @param width The new width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Calculate and return the area of the shape
     * @return The area of the Shape
     */
    public double getArea(){
        return this.length * this.width;
    }

    /**
     * Calculate and return the perimeter of a shape
     * @return The perimeter of the shape
     */
    public double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }
    public String display(){

        return  "====================================" +
        "\nDetails of " + this.getClass().getName() +
        "\nLength: " + this.length +
        "\nWidth: " + this.width +
        "\nArea: " + this.getArea() +
        "\nPerimeter: " + this.getPerimeter();
    }
}
