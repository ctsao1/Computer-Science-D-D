public class SortedArrayTester {
    public static void main(String[] args) {
        SortedArrayList<String> list = new SortedArrayList<String>();
        String[] array = {"galaxy", "stone", "banana", "wind", "jungle", "apple", "shadow", "ocean", "bridge", "zebra", "candle", "river", "planet", "sky", "forest", "valley", "desert", "cloud", "island", "mountain"};
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
    }
}
