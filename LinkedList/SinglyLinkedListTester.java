public class SinglyLinkedListTester {
    public static void main(String[] args) {
        String[] alphabet = new String[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = String.valueOf((char) (i + 97));
        }

        SinglyLinkedList list = new SinglyLinkedList<>();
        SinglyLinkedList list2 = new SinglyLinkedList<>(alphabet);

        System.out.println(list.toString());
        System.out.println(list2.toString());

    }
}
