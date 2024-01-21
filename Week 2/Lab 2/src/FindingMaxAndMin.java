public class FindingMaxAndMin
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 4, 3, 5, 6};
        System.out.println("Max: " + Max(arr, arr.length) + " and Min: " + Min(arr, arr.length));
    }
    static int Max(int arr[], int n){
        if(n==1)
            return arr[0];
        return Math.max(arr[n-1], Max(arr, n-1));
    }
    static int Min(int arr[], int n){
        if(n==1)
            return arr[0];
        return Math.min(arr[n-1], Min(arr, n-1));
    }
}
