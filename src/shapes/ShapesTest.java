package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Quadrilateral myShape;
        Quadrilateral myShape1;

        myShape = new Rectangle(4, 5);
        myShape1 = new Square(5);

        myShape.getArea();
        myShape.getPerimeter();

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());

        System.out.println(myShape.getLength());
        System.out.println(myShape.getWidth());



    }

}
