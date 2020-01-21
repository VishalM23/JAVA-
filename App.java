public class App
{
    public static void main(String[] args)
    {
        Cylinder c1=new Cylinder(10.0,10.0,"Bl");
        Cylinder c2=new Cylinder(10.0,10.0,"Bl");
        boolean a;
        a=c1.equals(c2);
        if(c1.equals(c2))
            System.out.println(a);
        else
            System.out.println("NOT Similar");
    }
}
