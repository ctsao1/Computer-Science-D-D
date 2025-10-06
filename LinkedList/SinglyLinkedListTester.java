public class SinglyLinkedListTester {
    public static void main(String[] args) {
        String[] alphabet = new String[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = String.valueOf((char) (i + 65));
        }

        SinglyLinkedList list = new SinglyLinkedList<>();
        SinglyLinkedList list2 = new SinglyLinkedList<>(alphabet);

        System.out.println(list.toString());
        System.out.println(list2.toString());

        // System.out.println(list2.indexOf("A"));
        // list2.remove("A");
        // list2.remove(1);

        // list2.remove("G");
        // list2.remove(5);
        list2.add(null);

        System.out.println(list2.toString());

    }
}
