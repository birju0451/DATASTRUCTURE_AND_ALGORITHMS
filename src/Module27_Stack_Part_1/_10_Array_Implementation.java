package Module27_Stack_Part_1;

public class _10_Array_Implementation {
    public static class stacks {
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            idx--;
            return arr[idx]; // return and "remove" the top element
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("The stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.print("Stack elements (bottom to top): ");
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return idx;
        }

        boolean isEmpty() {
            return idx == 0;
        }

        boolean isFull() {
            return idx == arr.length;
        }
    }

    public static void main(String[] args) {
        stacks st = new stacks();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60); // Should show "Stack is full"

        st.display(); // 10 20 30 40 50

        System.out.println("Top element: " + st.peek()); // 50
        System.out.println("Popped: " + st.pop());       // 50
        System.out.println("Popped: " + st.pop());       // 40

        st.display(); // 10 20 30

        System.out.println("Size: " + st.size());        // 3
        System.out.println("Is Empty? " + st.isEmpty()); // false
        System.out.println("Is Full? " + st.isFull());   // false
    }
}

