import java.util.Arrays;

public class RotatingArrayBy_k_Position
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int arr[],int s, int n)
    {
        while(s<n){
            int temp = arr[s];
            arr[s] = arr[n];
            arr[n] = temp;
            s+=1; n-=1;
        }
    }
}
