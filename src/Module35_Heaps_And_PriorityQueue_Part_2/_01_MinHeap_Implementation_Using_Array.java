package Module35_Heaps_And_PriorityQueue_Part_2;

class MinHeap {
    private int[] arr;
    private int size;

    MinHeap(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void add(int num) throws Exception {
        if (size == arr.length) throw new Exception("Heap is Full!");
        arr[size++] = num;
        upheapify(size - 1);
    }

    public void upheapify(int idx) {
        if (idx == 0) return;
        int parent = (idx - 1) / 2;
        if (arr[parent] > arr[idx]) {
            swap(idx, parent);
            upheapify(parent);
        }
    }

    public void swap(int idx, int parent) {
        int temp = arr[idx];
        arr[idx] = arr[parent];
        arr[parent] = temp;
    }

    public int getSize() {
        return size;
    }

    public int peek() throws Exception {
        if (getSize() == 0) throw new Exception("Heap is Empty!");
        return arr[0];
    }

    public int remove() throws Exception {
        if (size == 0) throw new Exception("Heap is Empty!");
        int peek = arr[0];
        swap(0, size - 1);
        size--;
        downHeapify(0);
        return peek;
    }

    public void downHeapify(int idx) {
        int lc = 2 * idx + 1;
        int rc = 2 * idx + 2;
        int minidx = idx;

        if (lc < size && arr[lc] < arr[minidx]) minidx = lc;
        if (rc < size && arr[rc] < arr[minidx]) minidx = rc;

        if (idx == minidx) return;

        swap(idx, minidx);
        downHeapify(minidx);
    }
    public void printHeap() {
        System.out.print("Heap: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class _01_MinHeap_Implementation_Using_Array {
    public static void main(String[] args) throws Exception {
        MinHeap pq = new MinHeap(6);

        pq.add(10);
        pq.printHeap();

        pq.add(5);
        pq.printHeap();

        pq.add(20);
        pq.printHeap();

        pq.add(2);
        pq.printHeap();

        System.out.println("Peek: " + pq.peek());

        System.out.println("Removed: " + pq.remove());
        pq.printHeap();

        System.out.println("Removed: " + pq.remove());
        pq.printHeap();

        System.out.println("Peek: " + pq.peek());
        System.out.println("Heap Size: " + pq.getSize());
    }
}
