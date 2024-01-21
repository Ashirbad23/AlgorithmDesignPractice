public class StackUsingArray
{
    public static void main(String[] args) {
        StackA <Integer> stack = new StackA<>(4);
        stack.push(14);
        stack.push(13);
        stack.push(15);
        stack.push(16);
//        System.out.println(stack.peek());
        stack.print();
        System.out.println();
        stack.pop();
        stack.print();
    }
}
class StackA<T>{
    int n;
    T[] arr;
    int top = -1;

    StackA(int n){
        this.n=n;
        this.arr = (T[]) new Object[n];
    }

    void push(T x){
        if(top+1 == n){
            System.out.println("Stack Overflow!");
            return;
        }
        top = top+1;
        arr[top] = x;
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack Underflow!");
            return;
        }
        arr[top]=null;
        top-=1;
    }
    T peek(){
        if(top==-1){
            System.out.println("Stack Underflow!");
            return null;
        }
        return arr[top];
    }
    void print(){
        if(top==-1){
            System.out.println("Stack Underflow!");
            return;
        }
        int temp = top;
        while (temp>=0){
            System.out.println(arr[temp--]);
        }
    }

}
