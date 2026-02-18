public class HeapPQTester {
    public static void main(String[] args) {
        MyPQ<Integer> heap = new MyPQ<Integer>();
        heap.add(10);
        heap.add(13);
        // heap.add(11);
        // heap.add(2);
        // heap.add(5);
        // heap.add(6);
        // heap.add(9);
        while (!heap.isEmpty()) {
            heap.removeMin();
            System.out.println(heap.toString());
        }
    }
}
