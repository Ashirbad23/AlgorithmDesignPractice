public class LinkedList<T> {
    private static class Node<T> {
        T data;
        Node next;

        Node(T d) {
            this.data = d;
        }
    }

    private Node head;
    int length = 0;

    void create(T data) {
        Node newNode = new Node(data);
        newNode.next = null;
        head = newNode;
        length += 1;
    }

    void add(T data) {
        if (head == null) {
            create(data);
            return;
        }
        Node node = new Node(data);
        node.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        length += 1;
    }

    void insertAt(T data, int index) {
        if (head == null) {
            create(data);
            return;
        }
        Node node = new Node(data);
        node.next = null;
        if (index == 0) {
            node.next = head;
            head = node;
            length += 1;
            return;
        }
        if (index >= length) {
            System.out.println("Index " + index + " OutOfBounds!");
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        length += 1;
    }

    void delete(T data) {
        if (head == null) {
            System.out.println("List is empty, Nothing to delete!");
            return;
        }
        if (head.data == data) {
            head = head.next;
            length -= 1;
            return;
        }
        Node temp = head;
        Node previous = null;
        boolean key = true;
        while (temp != null) {
            if (temp.data == data) {
                previous.next = temp.next;
                key = false;
                length -= 1;
                return;
            }
            previous = temp;
            temp = temp.next;
        }
        try {
            if (key)
                throw new NullPointerException();
        } catch (Exception e) {
            System.out.println("!error! Node with data " + data + " not found in the list! ");
        }
    }

    void reverse() {
        Node reversed = null;
        Node present = head;
        Node hold;

        while (present != null) {
            hold = present.next;
            present.next = reversed;
            reversed = present;
            present = hold;
        }
        System.out.println("List reversed successfully! ");
        head = reversed;
    }

    void print() {
        if (head == null) {
            System.out.println("Empty list!!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("|End|");
    }
}
