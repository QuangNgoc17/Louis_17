package OOP_6_1;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side, "unknown", false);
    }

    public double getSide() {
        return getWidth(); // The side of a square is the same as its width
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
