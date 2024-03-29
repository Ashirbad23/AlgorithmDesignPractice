public class largestSumContiguousSubArray
{
    public static void main(String[] args)
    {
        int[] a = { -1, -4, 5, 6, -1, 7, -12 };
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
    }
    static int maxSubArraySum(int[] a)
    {
        int size = a.length;
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;
        for(int i=0;i<size;i++){
            maxEndingHere+=a[i];
            if(maxSoFar<maxEndingHere){
                maxSoFar = maxEndingHere;
            }
            if(maxEndingHere<0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }
}
