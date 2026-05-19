public class DynamicProgrammingTester {
    public static void main(String[] args) {
        int[] low = {5, 20, 10, 25, 15, 30, 10, 40, 5, 35, 20, 15};
        int[] high = {50, 10, 60, 20, 80, 25, 100, 30, 90, 10, 70, 120};
        System.out.println(DynamicProgramming.hiLoStress(low, high));
        int lownum = 0;
        int highnum = 0;
        for (int i = 0; i < low.length; i++) {
            lownum += low[i];
        }
        for (int i = 0; i < high.length; i++) {
            highnum += high[i];
        }
        System.out.println(lownum);
        System.out.println(highnum);
    }
}
