public class FactorialOfNumber
{
    public static void main(String[] args)
    {
        int n = 10;
        int product = 1;
        for(int i=n;i>0;i--)
        {
            product*=i;
        }
        System.out.println(product);
    }
}
