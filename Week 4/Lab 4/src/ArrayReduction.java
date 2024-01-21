import java.util.*;

public class ArrayReduction {
    public static void main(String[] args) {
        int[] array = {1, 0, 4, 2, 6};
        int reductions = 0;

        while (array.length > 0) {
            int min = Arrays.stream(array).min().getAsInt();
            for (int i = 0; i < array.length; i++) {
                array[i] -= min;
            }
            System.out.println("After reduction " + (reductions + 1) + ": " + Arrays.toString(array));

            List<Integer> list = new ArrayList<>();
            for (int i : array) {
                if (i != 0) {
                    list.add(i);
                }
            }
            array = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                array[i] = list.get(i);
            }

            reductions+=1;
        }

        System.out.println("Total number of reductions performed: " + reductions);
    }
}
