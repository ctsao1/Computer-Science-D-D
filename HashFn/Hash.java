public class Hash {

    private String[] hash;

    public Hash() {
        hash = new String[500];
    }

    public int idGenerator(String name) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            int charaNum = name.charAt(i);
            for (int j = 0; j < hash.length; j++) {
                str.append(String.valueOf(charaNum));
            }
        }
        return Integer.parseInt(str.toString()) % 500;
    }

    public void hashFn(String name) {
        int num = idGenerator(name);
        if (hash[num] != null) {
            throw new IllegalArgumentException();
        }
        hash[num] = name;
    }

}
