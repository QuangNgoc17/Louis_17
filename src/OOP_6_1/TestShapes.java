package OOP_6_1;

public class TestShapes {

        public static void main(String[] args) {
            Shape s1 = new Circle(5.5, "red", false);
            System.out.println(s1);                // Circle[Shape[color=red, filled=false], radius=5.5]
            System.out.println(s1.getArea());      // 95.03317777109125
            System.out.println(s1.getPerimeter()); // 34.55751918948772
            System.out.println(s1.getColor());     // red
            System.out.println(s1.isFilled());     // false
            System.out.println(((Circle) s1).getRadius()); // 5.5

            Circle c1 = (Circle) s1;
            System.out.println(c1);
            System.out.println(c1.getArea());
            System.out.println(c1.getPerimeter());
            System.out.println(c1.getColor());
            System.out.println(c1.isFilled());
            System.out.println(c1.getRadius());

            Shape s2 = new Shape(); // Error: Cannot instantiate an abstract class

            Shape s3 = new Rectangle(1.0, 2.0, "red", false);
            System.out.println(s3);
            System.out.println(s3.getArea());
            System.out.println(s3.getPerimeter());
            System.out.println(s3.getColor());
            System.out.println(((Rectangle) s3).getLength());

            Rectangle r1 = (Rectangle) s3;
            System.out.println(r1);
            System.out.println(r1.getArea());
            System.out.println(r1.getColor());
            System.out.println(r1.getLength());

            Shape s4 = new Square(6.6);
            System.out.println(s4);
            System.out.println(s4.getArea());
            System.out.println(s4.getColor());
            System.out.println(((Square) s4).getSide());

            Rectangle r2 = (Rectangle) s4;
            System.out.println(r2);
            System.out.println(r2.getArea());
            System.out.println(r2.getColor());
            System.out.println(r2.getLength());
            System.out.println(((Square) r2).getSide());

            Square sq1 = (Square) r2;
            System.out.println(sq1);
            System.out.println(sq1.getArea());
            System.out.println(sq1.getColor());
            System.out.println(sq1.getSide());
        }
}
