public class nthFibonacci
{
    public static void main(String[] args)
    {
        int n = 4;
        int i = 0, j = 1, fib=0;
        for(int z=2;z<=n;z++){
            fib = i+j;
            i=j;
            j=fib;
        }
        System.out.println(j);
    }
}
