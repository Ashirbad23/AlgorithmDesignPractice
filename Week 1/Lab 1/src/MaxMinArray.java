import java.util.Arrays;

public class MaxMinArray
{
    public static void main(String[] args)
    {
        int arr[] = {10, 20, 30, 40, 50};
        solution(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void solution(int arr[], int n)
    {
        int temp[] = arr.clone();
        int small = 0, large = n-1;
        boolean flag = true;
        for(int i=0;i<n;i++)
        {
            if(flag)
                arr[i] = temp[large--];
            else
                arr[i] = temp[small++];
            flag=!flag;
        }
    }
}
