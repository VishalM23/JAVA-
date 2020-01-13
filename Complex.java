//Lab Progam-1 : Demonstate addition and subtraction of two complex numbers and thereby exhibit constructor overloading
public class Complex
{
    int real,imag;
    public Complex()   //default constructor
    {
        real=0;
        imag=0;
    }
    public Complex(int a,int b)    //parameterized constructor
    {
        real=a;
        imag=b;
    }
    public Complex add(Complex c1,Complex c2)
    {
        Complex c3=new Complex();
        c3.real=c1.real+c2.real;
        c3.imag=c1.imag+c2.imag;
        return c3;
    }
    public Complex sub(Complex c1,Complex c2)
    {
        Complex c3=new Complex();
        c3.real=c1.real-c2.real;
        c3.imag=c1.imag-c2.imag;
        return c3;
    }
    public void display(Complex c1)
    {
        System.out.println(c1.real+"+i"+c1.imag);
    }
    public static void main(String[] args)
    {
        Complex c1=new Complex(10,20);
        Complex c2=new Complex(5,2);
        Complex c3=new Complex();
        c3=c3.add(c1,c2);
        System.out.println("SUM=");
        c3.display(c3);
        System.out.println("DIFF=");
        c3=c3.sub(c1,c2);
        c3.display(c3);
    }

}
