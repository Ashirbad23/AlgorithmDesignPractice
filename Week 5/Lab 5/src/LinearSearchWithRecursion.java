public class LinearSearchWithRecursion
{
    public static void main(String[] args) {
        int arr[] = {3, 4, 0, 5, 6, 7, 8, 9};
        int n = 0;
        System.out.println("The element "+n+" is found at index: "+search(arr, arr.length, n));
    }
    private static int search(int arr[], int i, int n){
        if(arr[i-1]==n){
            return i-1;
        }
        return search(arr, i-1, n);
    }
}
