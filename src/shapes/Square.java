package shapes;

public class Square extends Quadrilateral {


    public Square(double side) {
        super(side, side); // might need just length length instead
    }

    @Override
    public double getPerimeter() {
        System.out.println("This is from Square class: " + length * 4);
        return length * 4;
    }  // Doesn't reach!!!



}
