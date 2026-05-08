public class HuffmanTester {
    public static void main(String[] args) {
        HuffmanCodeGenerator huffer = new HuffmanCodeGenerator("test.txt");
        huffer.makeCodeFile("YIPPEE.txt");
        HuffmanEncoder hufferEncoder = new HuffmanEncoder("YIPPEE.txt");
        HuffmanDecoder huffmanDecoder = new HuffmanDecoder("YIPPEE.txt");
        
        hufferEncoder.encodeFile("test.txt");
        huffmanDecoder.decodeFile("test.txt.huf");

    }
}
