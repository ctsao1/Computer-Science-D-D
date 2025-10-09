public class DoublyLinkedListTester {
    public static void main(String[] args) {


        Nucleotide A = Nucleotide.A;
        Nucleotide G = Nucleotide.G;
        Nucleotide T = Nucleotide.T;
        Nucleotide C = Nucleotide.C;
        Nucleotide[] dna = new Nucleotide[4];
        int j = 1;
        for (int i = 0; i < dna.length; i++) {
            if (j == 5) {
                j = 1;
            }
            if (j % 4 == 0) {
                dna[i] = C;
            } else if (j % 3 == 0) {
                dna[i] = T;
            } else if (j % 2 == 0) {
                dna[i] = G;
            } else {
                dna[i] = A;
            }
            j++;
        }
        DoublyLinkedList list = new DoublyLinkedList();
        DoublyLinkedList list2 = new DoublyLinkedList(dna);
        list.add(Nucleotide.A);
        System.out.println(list2.toString());
        System.out.println(list.toString());

        list.add(T);
        list.add(0, C);

        System.out.println(list.toString());
        System.out.println("Tail: " + list.getTail().getValue());
        System.out.println("Head: " + list.getHead().getValue());
        System.out.println("Sentinel: " + list.getSentinel().getValue());

        // System.out.println(list.contains(Nucleotide.G));
        // System.out.println(list.contains(Nucleotide.A));

        // System.out.println(list.indexOf(A));
        // System.out.println(list.indexOf(G));
        // System.out.println(list2.indexOf(A));
        // System.out.println(list2.indexOf(C));

        // System.out.println(list.remove(A));
        // System.out.println(list.toString());
        // System.out.println(list.remove(C));
        // System.out.println(list2.remove(G));
        // System.out.println(list2.toString());

        // list2.add(3, A);
        // System.out.println(list2.toString());
    }
}
