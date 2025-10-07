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

        String[] array = new String[5];
        SinglyLinkedList list3 = new SinglyLinkedList<>(array);

        // System.out.println(list2.indexOf("A"));
        // list2.remove("A");
        // list2.remove(1);

        // list2.remove("G");
        // list2.remove(5);
        // list2.add(null);
        list2.add(5, null);

        System.out.println(list2.toString());
        System.out.println(list2.getHead().getValue());
        System.out.println(list2.getTail().getValue());
        System.out.println(list3.getHead().getValue());
        System.out.println(list3.getTail().getValue());
        System.out.println(list3.toString());

        System.out.println(list.getHead());
        System.out.println(list.getTail());
        list.add("Joe");
        System.out.println(list.getHead().getValue());
        System.out.println(list.getTail().getValue());
        

    }
}
