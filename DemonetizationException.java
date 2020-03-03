public class DemonetizationException extends Exception
{
        float amount;
        DemonetizationException(float amt)
        {
            amount=amt;
        }
        public String toString()
        {
            return "Deposit of old currency of Rs"+amount+"crosses 5000";
        }

}
