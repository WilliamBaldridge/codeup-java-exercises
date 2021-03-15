package shapes;

public class Square extends Rectangle{

    public Square(int side) {
        super(side, side);
    }

    public int getArea() {
        return (int) Math.pow(length, 2);
    }

    public void getPerimeter() {
//        return length * 4;
        System.out.println("Square perimeter is: " + length * 4);
    }

}
