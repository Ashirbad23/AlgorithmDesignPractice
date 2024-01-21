import java.util.Stack;

public class DecimalToHexadecimal
{
    static char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static String Hex = "";
    static int num=0;
    public static void main(String[] args) {
        System.out.println(dToh(2350));
    }
    static String dToh(int dec){
        if(dec!=0){
            num = dec%16;
            Hex = hexChars[num]+Hex;
            dToh(dec/16);
        }
        return Hex;
    }
}
