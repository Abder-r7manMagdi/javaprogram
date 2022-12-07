package Interface;

interface public abstract class Circle {
    double radius;
    String color;

    public Circle ( double radius , String color ) {
        this.radius = radius;
        this.color = color;
    }

    public abstract double getRadius () ;

    public void setRadius ( double radius ) {
        this.radius = radius;
    }

    public abstract String getColor ();

    public void setColor ( String color ) {
        this.color = color;
    }
    public abstract double getArea();
}
