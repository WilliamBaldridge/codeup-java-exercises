package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(4, 5);
        System.out.println(r1.getArea());
        r1.getPerimeter();

        Square s1 = new Square(5);
        System.out.println(s1.getArea());
        s1.getPerimeter();


    }

}
