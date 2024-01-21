import java.util.*;

public class PrintDuplicatesOfAList
{
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 4, 5, 5};
        System.out.println(findDuplicates(arr));
    }
    static List<Integer> findDuplicates(int arr[]){
        List<Integer> open = new ArrayList<>();
        Set<Integer> occurred = new HashSet<>();
        for(int i: arr){
            if(occurred.contains(i)){
                open.add(i);
            }
            else{
                occurred.add(i);
            }
        }
        return open;
    }
}
