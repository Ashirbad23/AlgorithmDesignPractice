import java.util.*;

public class FindingFirstRepeatedElement
{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 2, 4, 4};
        System.out.println(findRepeated(arr));
    }
    static int findRepeated(int arr[]){
        List<Integer> open = new ArrayList<>();
        for(int i: arr){
            if(open.contains(i)){
                return i;
            }
            else{
                open.add(i);
            }
        }
        return -1;
    }
}
