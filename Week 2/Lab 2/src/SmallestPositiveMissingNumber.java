import java.util.*;

public class SmallestPositiveMissingNumber
{
    static HashSet<Integer> present = new HashSet<>();
    static int max=Integer.MIN_VALUE;
    public static void main(String[] args) {
        int arr[] = {0, 10, 1, 2, -3, -4};
        int n = arr.length;
        makeSet(arr, n);
        System.out.println(findMissing(arr, 1, max));
    }
    static void makeSet(int arr[], int n){
        if(n==0){
            return;
        }
        if(arr[n-1]>0) {
            present.add(arr[n-1]);
            max = Math.max(arr[n-1], max);
        }
        makeSet(arr, n-1);
    }
    static int findMissing(int arr[], int start, int end){
        if(start>end){
            return end+1;
        }
        if(!present.contains(start)){
            return start;
        }
        return findMissing(arr, start+1, end);
    }
}
