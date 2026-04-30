public class HuffmanTester {
    public static void main(String[] args) {
        HuffmanCodeGenerator huffer = new HuffmanCodeGenerator("test.txt");
        // for (int i = 0; i < huffer.getMap().keySet().toArray().length; i++) {
        //     System.out.println(huffer.getMap().keySet().toArray()[i] + " | " + huffer.getMap().values().toArray()[i]);
        // }
        
        // System.out.println();

        // for (int i = 0; i < huffer.getHeap().toArray().length; i++) {
        //     System.out.println(huffer.getHeap().toArray()[i]);
        // }

        // System.out.println();

        // for (int i = 0; i < huffer.getDictionary().keySet().toArray().length; i++) {
        //     System.out.println(huffer.getDictionary().keySet().toArray()[i] + " | " + huffer.getDictionary().values().toArray()[i]);
        // }

        for (int i = 0; i < huffer.getDictionary2().length; i++) {
            System.out.println(huffer.getDictionary2()[i]);
        }

        huffer.makeCodeFile("YIPPEE.txt");
    }
}
