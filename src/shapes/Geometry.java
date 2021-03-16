package shapes;

public abstract class Geometry implements Shape {

    protected double length;
    protected double width;
    protected double height;
    protected double depth;

    public Geometry(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }


    public double getPerimeter() {
        System.out.println("This is at Geo class level: " + ((2 * length) + (2 * width)));
        return (2 * length) + (2 * width);
    }

    public double getArea() {
        return length * width;
    }

    public double getCircumference() {
        return 0;
    }

    public double getVolume() {
        return 0;
    }

}
