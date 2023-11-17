package OOP_1_9;

public class Ball {
    private double radius;
    private double x;
    private double y;
    private double deltaX;
    private double deltaY;

    public Ball(double x, double y, double radius, double deltaX, double deltaY) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }
        
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDeltaX() {
        return deltaX;
    }

    public void setDeltaX(double deltaX) {
        this.deltaX = deltaX;
    }

    public double getDeltaY() {
        return deltaY;
    }

    public void setDeltaY(double deltaY) {
        this.deltaY = deltaY;
    }

    public void move() {
        x += deltaX;
        y += deltaY;
    }

    public void reflectHorizontal() {
        deltaX = -deltaX;
    }

    public void reflectVertical() {
        deltaY = -deltaY;
    }

    @Override
    public String toString() {
        return "Ball[x=" + x + ", y=" + y + ", radius=" + radius + "]";
    }

}
