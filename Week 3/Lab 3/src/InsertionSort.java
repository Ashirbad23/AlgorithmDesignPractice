import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args) {
        int arr[] = {4, 5, 3, 2, 0, 1, -1};
        Sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    private static void Sort(int arr[], int n){
        if(n<=1){
            return;
        }
        Sort(arr, n-1);
        int last = arr[n-1];
        int j = n-2;
        while (j>=0&&arr[j]>last){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1]=last;
    }
}
