import java.util.*;

public class FindMissingNumberInTheArray
{
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 6, 5, 8, 7};
        int n = arr.length;
        System.out.println(findMissing(arr, n));
    }
    static int findMissing(int arr[], int N){
        List<Integer> open = new ArrayList<>();
        for(int i: arr){
            open.add(i);
        }
        int max = arr[0];
        for(int i:arr){
            max=Math.max(i, max);
        }

        for(int i=1;i<=max;i++){
            if(!open.contains(i)){
                return i;
            }
        }
        return max+1;
    }
}
