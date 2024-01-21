import java.util.Arrays;

public class MergeTwoSortedArrays
{
    public static void main(String[] args) {
        int arr1[] = {0, 1, 2, 7, 10, 11};
        int arr2[] = {3, 4, 6, 9, 12};
        int s1=arr1.length, s2=arr2.length;
        int result[] = new int[s1+s2];
        merger(arr1, arr2, s1, s2, result);
        System.out.println(Arrays.toString(result));
    }

    static void merger(int arr1[], int arr2[], int n1, int n2, int arr3[]){
        int i=0, j=0, k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(j<n2){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        while (i<n1){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
    }
}
