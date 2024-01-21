import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args) {
        int arr[] = {-4, -5, -6, -7, 0, 2};
        Sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    private static void Sort(int arr[], int n){
        if(n==1){
            return;
        }
        int count = 0;
        for(int i=0; i<n-1;i++){
            if(arr[i]>arr[i+1]){
                Swap.swap(arr, i, i+1);
                count+=1;
            }
        }
        if(count==0){
            return;
        }
        Sort(arr, n-1);
    }

//    private static void swap(int[] arr, int i, int j) {
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
}
