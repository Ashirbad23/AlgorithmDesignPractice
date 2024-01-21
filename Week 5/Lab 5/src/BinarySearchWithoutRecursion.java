public class BinarySearchWithoutRecursion
{
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 7, 8, 9};
        int n = 4;
        System.out.println("The element "+n+" is found at index: "+search(arr, n));
    }
    private static int search(int arr[], int n){
        int i=0, j=arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]==n){
                return mid;
            }
            if(arr[mid]>n){
                j=mid-1;
            } else i = mid+1;
        }
        return -1;
    }
}
