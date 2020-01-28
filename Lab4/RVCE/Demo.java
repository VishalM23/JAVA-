package RVCE;

import CSE.Thirdsem;

public class Demo
{
    public static void main(String[] args)
    {
        Cse_dept c1=new Cse_dept();
        c1.Welcomemsg();
        Thirdsem c2=c1;
        ((Cse_dept)(c2)).Welcomemsg();
    }
}
