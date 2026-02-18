public class HeapPQTester {
    public static void main(String[] args) {
        HeapPQ<Integer> heap = new HeapPQ<Integer>();
        heap.add(10);
        System.out.println(heap.toString());
        heap.add(13);
        System.out.println(heap.toString());
        heap.add(11);
        System.out.println(heap.toString());
        heap.add(2);
        System.out.println(heap.toString());
        heap.add(5);
        System.out.println(heap.toString());
        heap.add(6);
        System.out.println(heap.toString());
    }
}
