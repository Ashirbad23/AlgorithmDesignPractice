import java.util.*;

public class ElementOccurringMaxNumberOfTimes
{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3, 5, 4, 6, 4};
        findMaxOccurring(arr);
    }
    static void findMaxOccurring(int arr[]){
        Map<Integer, Integer> open = new HashMap<>();
        Set<Integer> ele = new HashSet<>();
        for(int i: arr){
            ele.add(i);
        }
        for(int i: ele){
            open.put(i, 0);
        }
        for(int i: arr){
            if(open.containsKey(i)){
                open.put(i, open.get(i)+1);
            }
        }
        int max = Integer.MIN_VALUE;
        int num = 0;
        for(int i:ele) {
            if (open.get(i) > max) {
                max = open.get(i);
                num = i;
            }
        }
        System.out.println("Element "+num+" occurring "+max+" times");
    }
}
