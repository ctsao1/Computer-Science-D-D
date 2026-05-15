public class DynamicProgrammingTester {
    public static void main(String[] args) {
        int[] low = {7, 1, 2, 4};
        int[] high = {5, 3, 6, 4};
        System.out.println(DynamicProgramming.hiLoStress(low, high));
    }
}
