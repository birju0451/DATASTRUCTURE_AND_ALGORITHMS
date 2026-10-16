package test;
class Stack{
    int size;
    int[] arr;
    int top;
    Stack(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public boolean isFull(){
        if(top == size-1) return true;
        return false;
    }
    public boolean isEmpty(){
        if(top == -1) return true;
        return false;
    }
    public void push(int ele){
        if(isFull()){
            System.out.println("Stack is full you cant inset this element " + ele);
            return;
        }
        arr[++top] = ele;
    }

    public void pop() {
        if(isEmpty()){
            System.out.println("Stack is Empty you cant not delete element");
            return;
        }
        arr[top--] = 0;
    }

    public void display(){
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public void peek() {
        if(isEmpty()){
            System.out.println(-1);
            return;
        }
        System.out.println(arr[top]);
    }

    public void size() {
        System.out.println(arr.length);
    }
}
public class test {
    public static void main(String[] args) {
        Stack st = new Stack(4);

        st.push(3);
        st.push(2);
        st.push(7);
        st.push(32);
        st.push(4);

        st.peek();
        st.size();

        st.display();
        st.peek();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        System.out.println(st.isFull());

        st.peek();

    }
}
