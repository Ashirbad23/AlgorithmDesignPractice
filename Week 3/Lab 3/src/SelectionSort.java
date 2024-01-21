import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args) {
        int arr[] = {10, -20, 40, -40, 30, -30};
        Sort(arr,arr.length,0);
        System.out.println(Arrays.toString(arr));
    }
    private static void Sort(int arr[], int n, int index){
        if(index==n){
            return;
        }
        int k = minIndex(arr, index, n-1);

        if(index!=k){
            Swap.swap(arr, index, k);
        }
        Sort(arr, n, index+1);
    }

//    private static void swap(int[] arr, int i, int j) {
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }

    static int minIndex(int[] arr, int index, int n) {
        if(index==n){
            return index;
        }
        int k = minIndex(arr, index+1, n);
        if(arr[index]<arr[k])
            return index;
        return k;
    }
}
