public class LinearSearchWithoutRecursion
{
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 7, 8, 9, 0};
        int n = 0;
        System.out.println("The element "+n+" is found at index: "+search(arr, n));
    }
    private static int search(int arr[], int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
}
