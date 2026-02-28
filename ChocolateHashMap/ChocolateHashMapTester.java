public class ChocolateHashMapTester {
    public static void main(String[] args) {
      ChocolateHashMap<String, ChocolateBatch> inventory = new ChocolateHashMap<>(5, 0.75);

      // Create 5 batches
      ChocolateBatch b1 = new ChocolateBatch("Truffle Box", 72, "Ecuador", 120);
      ChocolateBatch b2 = new ChocolateBatch("70% Dark Bar", 70, "Ghana", 500);
      ChocolateBatch b3 = new ChocolateBatch("Milk Bar", 45, "Peru", 650);
      ChocolateBatch b4 = new ChocolateBatch("White Bar", 30, "Madagascar", 300);
      ChocolateBatch b5 = new ChocolateBatch("Cocoa Nibs Bag", 85, "Colombia", 200);

      // Keys (SKU / lot codes)
      String k1 = "SKU-TRUF-001";
      String k2 = "SKU-BAR-070";
      String k3 = "SKU-BAR-MLK";
      String k4 = "SKU-BAR-WHT";
      String k5 = "SKU-NIBS-085";

      // Try to add them
      System.out.println("Adding 5 batches:");
      System.out.println("put(" + k1 + "): " + inventory.put(k1, b1));
      System.out.println("1");
      System.out.println("put(" + k2 + "): " + inventory.put(k2, b2));
      System.out.println("4");
      System.out.println("put(" + k3 + "): " + inventory.put(k3, b3));
      System.out.println("1");
      System.out.println("put(" + k4 + "): " + inventory.put(k4, b4));
      System.out.println("1");
      System.out.println("put(" + k5 + "): " + inventory.put(k5, b5));
      System.out.println("1");
      System.out.println(inventory.toString());

      System.out.println();

      System.out.println("getBuckets: " + inventory.getBuckets());
      System.out.println("isEmpty: " + inventory.isEmpty());
      System.out.println("size: " + inventory.size());
      System.out.println("currentLoadFactor: " + inventory.currentLoadFactor());
      System.out.println("containsKey: " + inventory.containsKey(k1));
      System.out.println("containsValue: " + inventory.containsValue(b1));
      System.out.println("get: " + inventory.get(k5));
      System.out.println("remove: " + inventory.remove(k2));
      inventory.rehash(inventory.getBuckets().length);
      System.out.println("toString: " + inventory.toString());

    }
  }

