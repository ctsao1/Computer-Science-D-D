public class Tester {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        MyArrayList array = new MyArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            array.set(i, i);
        }

        array.add(10);
        System.out.println(array.toString());
        array.remove(4);
        array.remove(9);

        System.out.println(array.toString());
    }
}
