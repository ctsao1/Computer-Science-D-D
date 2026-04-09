public class HeapPQTester {
    public static void main(String[] args) {
        MyPQ<Integer> heap = new MyPQ<Integer>();
        for (int i = 20; i >= 0; i--) {
            heap.add(i);
            System.out.println(heap.toString());
        }
        while (!heap.isEmpty()) {
            heap.removeMin();
            System.out.println(heap.toString());
        }
    }
}
