package Interface;

public class Cylinder extends Circle {
    public Cylinder ( double radius , String color ) {
        super ( radius , color );
    }

    @Override
    public double getRadius () {
        return 0;
    }

    @Override
    public String getColor () {
        return null;
    }

    @Override
    public double getArea () {
        return 0;
    }
}
