public class findMinAndMax
{
    public static void main(String[] args) {
        int arr[] = {15, 0, -1, 2, 4};
        int min = arr[0], max = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            else if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Min: "+min+" and Max: "+max);
    }
}
