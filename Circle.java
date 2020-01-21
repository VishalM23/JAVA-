public class Circle
{
    double radius;
    String color;
    public double getradius()
    {
        return radius;
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }

    Circle()
    {
        radius=radius;
        color="blak";
    }

    Circle(double radius)
    {
        this.radius=radius;
        color="black";
    }
    Circle(double radius,String color)
    {
        this.radius=radius;
        this.color=color;
    }

}
