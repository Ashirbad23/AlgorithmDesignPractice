import java.util.HashSet;

public class SmallestPositiveMissingNumber
{
    public static void main(String[] args)
    {
        int arr[] = { 0, 10, 2, -10, -20 };
        System.out.println(missing(arr));
    }
    static int missing(int arr[])
    {
        HashSet<Integer> present = new HashSet<>();
        int max = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>0){
                present.add(arr[i]);
                max = Math.max(max, arr[i]);
            }
        }
        for(int i=1;i<=max;i++){
            if(!present.contains(i)){
                return i;
            }
        }
        return 0;
    }
}
