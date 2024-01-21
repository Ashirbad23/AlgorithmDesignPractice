public class StackUsingLinkedList {
    public static void main(String[] args) {
        StackL<Integer> stackL = new StackL<>();
        stackL.push(13);
        stackL.push(14);
        stackL.push(15);
        stackL.push(16);
        stackL.print();
        System.out.println();
        stackL.pop();
        stackL.print();
    }
}
class StackL<T>{
    LinkedList<T> list = new LinkedList<>();
    void push(T data){
        list.insertFirst(data);
    }
    void pop(){
        list.deleteFirst();
    }
    T peek(){
        return list.viewFirstNode();
    }
    void print(){
        list.print();
    }

}
class LinkedList<T>{

    private class Node{
        T data;
        Node next;
        Node(T data){
            this.data = data;
        }
    }
    Node head = null;
    void insertFirst(T data){
        Node node = new Node(data);
        node.next=null;
        if(head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }
    void deleteFirst(){
        if(head == null){
            System.out.println("Stack Underflow!");
            return;
        }
        head=head.next;
    }
    T viewFirstNode(){
        if(head==null){
            return null;
        }
        return head.data;
    }
    void print() {
        if(head==null){
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
