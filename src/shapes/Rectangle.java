package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(int length, int width) {

        this.length = length;
        this.width = width;

    }

    public int getArea() {
        return length * width;
    }

    public void getPerimeter() {
//        return ;
        System.out.println("Rectangle perimeter is: " + (2 * length) + (2 * width));
    }


}
