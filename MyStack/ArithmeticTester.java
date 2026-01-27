public class ArithmeticTester {
    public static void main(String[] args) {
        // ( 2 + ( ( 3 * 5 ) / ( 11 - 6 ) ) )
        // 2 3 5 * 11 6 - / +
        System.out.println(Arithmetic.convertClassicToStout("( 2 + ( ( 3 * 5 ) / ( 11 - 6 ) ) )"));
        System.out.println(Arithmetic.evaluateStout("2 3 5 * 11 6 - / +"));
        System.out.println(Arithmetic.evaluate("( 2 + ( ( 3 * 5 ) / ( 11 - 6 ) ) )"));
    }
}
