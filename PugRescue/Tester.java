public class Tester {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList<>();
        list.add("list");
        System.out.println(list.toString());
        list.add("bozo");
        System.out.println(list.toString());
        list.add(1, "BOZO");
        System.out.println(list.toString());
        System.out.println(list.remove(0));
        System.out.println(list.toString());
        System.out.println(list.remove("BOZO"));
        System.out.println(list.toString());
    }
}
