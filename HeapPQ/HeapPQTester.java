public class HeapPQTester {
    public static void main(String[] args) {
        HeapPQ<Integer> heap = new HeapPQ<Integer>();
        heap.add(10);
        heap.add(13);
        heap.add(11);
        heap.add(2);
        heap.add(5);
        heap.add(6);
        heap.add(9);
        System.out.println(heap.toString());
        heap.removeMin();
        System.out.println(heap.toString());
        heap.removeMin();
        System.out.println(heap.toString());
        heap.removeMin();
        System.out.println(heap.toString());
    }
}
