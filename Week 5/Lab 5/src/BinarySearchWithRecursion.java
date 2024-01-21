public class BinarySearchWithRecursion
{
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7};
        int n = 3;
        System.out.println("The element "+n+" is found at index: "+search(arr,0, arr.length-1, n));
    }
    private static int search(int arr[], int i, int j, int n){
        if(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]==n){
                return mid;
            }
            if(arr[mid]>n){
                return search(arr, i, mid-1, n);
            }
            return search(arr, mid+1, j, n);
        }
        return -1;
    }
}
