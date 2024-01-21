public class nthPowerOfANumber
{
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
    static int power(int num, int pow){
        if(pow==0){
            return 1;
        }
        if(pow==1){
            return num;
        }
        return num*power(num, pow-1);
    }
}
