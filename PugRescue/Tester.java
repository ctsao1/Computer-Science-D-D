public class Tester {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // MyArrayList list = new MyArrayList<>();
        // list.add("list");
        // System.out.println(list.toString());
        // list.add("bozo");
        // System.out.println(list.toString());
        // list.add(1, "BOZO");
        // System.out.println(list.toString());
        // System.out.println(list.remove(0));
        // System.out.println(list.toString());
        // System.out.println(list.remove("BOZO"));
        // System.out.println(list.toString());

        Dog golden = new Dog("Joey", "Golden Retriever");
        Dog doge = new Dog("Doge", "Doge");
        MyArrayList<Dog> dogLine = new MyArrayList<>(100000000);
        for (int i = 0; i < 100000000; i++) {
            if (i % 2 == 1) {
                dogLine.add(golden);
            } else {
                dogLine.add(doge);
            }
        }
        PugSaver.rescuePugs(dogLine);

        System.out.println(dogLine.get(99999999));
        System.out.println(dogLine.get(50000001));
    }
}
