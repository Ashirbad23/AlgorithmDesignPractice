public class Main
{
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.create("Ashirbad");
        list.print();
        list.add("Ohm");
        list.add("Trupti");
        list.insertAt("Jigyansha", 0);
        list.print();
        list.insertAt("Hemant", 2);
        list.insertAt("Kruti", 3);
        list.print();
        list.delete("Jigyansha");
        list.print();
        list.delete("Trupti");
        list.print();
        list.reverse();
        list.print();
        System.out.println("Integer Input");
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.create(23);
        list1.print();
        list1.add(20);
        list1.add(21);
        list1.insertAt(15, 0);
        list1.print();
        list1.insertAt(32, 2);
        list1.insertAt(14, 3);
        list1.print();
        list1.delete(15);
        list1.print();
        list1.delete(21);
        list1.print();
        list1.reverse();
        list1.print();
    }
}
