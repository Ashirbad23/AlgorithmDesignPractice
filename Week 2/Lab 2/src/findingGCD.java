public class findingGCD
{
    public static void main(String[] args) {
        System.out.println(GCD(13, 14));
    }
    static int GCD(int m, int n){
        if(n==0){
            return m;
        }
        return GCD(n, m%n);
    }
}
