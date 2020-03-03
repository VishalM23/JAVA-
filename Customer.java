import java.util.Scanner;
public class Customer {
    public static void main(String[] args) {
        Account a1 = new Account();
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n");
            int ch;
            System.out.println("Choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Amount:");
                    float am;
                    am = sc.nextFloat();
                    System.out.println("Currency type:");
                    String ct;
                    ct = sc.next();
                    a1.deposit(am, ct);
                    break;
                case 2:
                    System.out.println("Withdraw:");
                    float f;
                    f = sc.nextFloat();
                    a1.withdraw(f);
                    break;
                case 3:
                    a1.currBalance();
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
