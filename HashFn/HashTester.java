public class HashTester {
    public static void main(String[] args) {
        Hash hash = new Hash();

        String[] names = {
            "Mateo Atluri",
            "Asher Butan",
            "Xander Cheuk",
            "Taj Clement",
            "Camille Condren",
            "Evan Daneshrad",
            "Felicia Duan",
            "Jake Effress",
            "Zachary Figlin",
            "James Graczyk",
            "David Hadi",
            "Quinn Harris",
            "Jackson Hubbard",
            "Siona Kirschner",
            "Dylan Martin",
            "Morgan Maynard",
            "Yari Milakin",
            "Waller Morton",
            "Andrew Stout",
            "Mattin Tasbihgoo",
            "Andrew Theiss",
            "Carter Tsao"
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(hash.idGenerator(names[i]));
            hash.hashFn(names[i]);
        }
    }
}
