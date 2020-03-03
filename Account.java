public class Account
{
    float balance;
    Account()
    {
        balance=500;
    }
    void deposit(float amt,String ctype)
    {
        try
        {
            if(ctype.equals("OLD")&&amt>5000)
                throw new DemonetizationException(amt);
            balance=balance+amt;
        }
        catch (DemonetizationException e)
        {
            System.out.println(e);
        }
    }
    void withdraw(float amt)
    {
        if(amt>500)
            balance-=amt;
        else
            System.out.println("Insufficient balance");
    }
    void currBalance()
    {
        System.out.println("The current balance:"+balance);
    }

}
