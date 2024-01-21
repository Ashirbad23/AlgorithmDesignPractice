

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        QueueL<Integer> queue = new QueueL<>();
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.print();
        System.out.println();
        queue.dequeue();
        queue.print();
        System.out.println();
        queue.push(40);
        queue.print();
    }
}
class QueueL<T>{
    LinkedList<T> list = new LinkedList<>();
    void push(T data){
        list.insertLast(data);
    }
    void dequeue(){
        list.deleteFirst();
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
    void insertLast(T data){
        Node node = new Node(data);
        node.next=null;
        if(head==null){
            head=node;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
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