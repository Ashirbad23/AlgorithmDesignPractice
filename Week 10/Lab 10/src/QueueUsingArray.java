

public class QueueUsingArray {
    public static void main(String[] args) {
        QueueA<Integer> queue = new QueueA<>(10);
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.print();
        System.out.println();
        queue.dequeue();
        queue.print();
        queue.push(40);
        queue.print();
    }
}

class QueueA<T>{
    int first, last, n;
    T arr[];

    QueueA(int n){
        first =last=0;
        this.n = n;
        arr = (T[]) new Object[n];
    }
    void push(T data){
        if(last == n){
            System.out.println("Queue Overflow!");
            return;
        }
        arr[last] = data;
        last++;
    }
    void dequeue(){
        if(first==last){
            System.out.println("Queue Underflow!");
            return;
        }
        for(int i = 0;i<last-1;i++) {
            arr[i]=arr[i+1];
        }
        if(last<n){
            arr[last]=null;
        }
        last--;
    }
    void print(){
        if (first==last) {
            System.out.println("Queue is Empty");
            return;
        }
        for(int i=first;i<=last-1;i++){
            System.out.println(arr[i]);
        }
    }

}
