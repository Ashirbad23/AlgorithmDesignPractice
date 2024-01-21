import java.util.*;

public class JavaCollections {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Element 1");
        arrayList.add(1, "Element 2");
        System.out.println("ArrayList: " + arrayList);
        arrayList.remove("Element 1");
        System.out.println("ArrayList after removal: " + arrayList);

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element 1");
        linkedList.add(1, "Element 2");
        System.out.println("\nLinkedList: " + linkedList);
        linkedList.remove("Element 1");
        System.out.println("LinkedList after removal: " + linkedList);

        // HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Value 1");
        hashMap.put(2, "Value 2");
        System.out.println("\nHashMap: " + hashMap);
        hashMap.remove(1);
        System.out.println("HashMap after removal: " + hashMap);
        System.out.println("Get value using key from HashMap: " + hashMap.get(2));

        // TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Element 1");
        treeSet.add("Element 2");
        System.out.println("\nTreeSet: " + treeSet);
        treeSet.remove("Element 1");
        System.out.println("TreeSet after removal: " + treeSet);

        // PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Element 1");
        priorityQueue.add("Element 2");
        System.out.println("\nPriorityQueue: " + priorityQueue);
        priorityQueue.remove("Element 1");
        System.out.println("PriorityQueue after removal: " + priorityQueue);
    }
}
