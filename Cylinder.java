public class Cylinder extends Circle
{
    double height;
    Cylinder()
    {
        super();
        height=0.0;
    }
    Cylinder(double height,double radius)
    {
        super(radius);
        this.height=height;
    }
    Cylinder(double height,double radius,String color)
    {
        super(radius,color);
        this.height=height;
    }
    public double getHeight()
    {
        return height;
    }
    public double getArea()
    {
        return 2*Math.PI*radius+2*super.getArea();
    }
    public double getvolume()
    {
        return super.getArea()*height;
    }
    public boolean equals(Cylinder c)
    {
        double b1=c.getArea();
        double b2=c.getArea();

        if(c.getvolume()==this.getvolume() && c.getArea() ==this.getArea() && (c.color).equals(this.color))
            return true;
        else
            return false;
    }

}
