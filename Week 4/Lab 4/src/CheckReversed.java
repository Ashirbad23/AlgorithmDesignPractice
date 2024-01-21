public class CheckReversed {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 5, 3, 11};
        System.out.println(checkReverse(arr));
    }

    static boolean checkReverse(int[] arr) {
        int n = arr.length;
        int s = 0, e = n - 1;
        while (s < n - 1 && arr[s] <= arr[s + 1]) {
            s++;
        }
        if (s == n - 1) {
            return true;
        }
        while (e > 0 && arr[e] >= arr[e - 1]) {
            e--;
        }
        reverseArray(arr, s, e);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Not sorted
            }
        }
        return true; // Sorted
    }
    static void reverseArray(int arr[], int a, int b){
        if(a<b){
            int i=a, j=b;
            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i+=1;
                j-=1;
            }
        }
        else{
            int i=a, j=b;
            while(j<i){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i-=1;
                j+=1;
            }
        }
    }
}
