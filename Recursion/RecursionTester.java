public class RecursionTester {
    public static void main(String[] args) {
        // // solveHanoi
        // Recursion.solveHanoi(3);

        // // printPermutations
        // Recursion.printPermutations("abc");

        // printSubsets
        // Recursion.printSubsets("a");
        // Recursion.printSubsets("ab");
        // Recursion.printSubsets("abc");

        // // countWaysToJumpUpStairs
        // System.out.println(Recursion.countWaysToJumpUpStairs(3));
        // System.out.println(Recursion.countWaysToJumpUpStairs(4));
        // System.out.println(Recursion.countWaysToJumpUpStairs(5));
        // System.out.println(Recursion.countWaysToJumpUpStairs(10));

        // // countNonConsecutiveSubsets
        // System.out.println(Recursion.countNonConsecutiveSubsets(0));
        // System.out.println(Recursion.countNonConsecutiveSubsets(1));
        // System.out.println(Recursion.countNonConsecutiveSubsets(4));
        // System.out.println(Recursion.countNonConsecutiveSubsets(6));

        // // Infect
        // String[][] row = new String[4][];
        // for (int i = 0; i < row.length; i++) {
        //     row[i] = new String[4];
        //     for (int j = 0; j < row[i].length; j++) {
        //         row[i][j] = "woah";
        //     }
        // }
        // row[2][2] = "vaccinated";
        // row[1][1] = "vaccinated";

        // for (int i = 0; i < row.length; i++) {
        //     for (int j = 0; j < row.length; j++) {
        //         System.out.print(row[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // Recursion.infect(row, 1, 2);
        // System.out.println();

        // for (int i = 0; i < row.length; i++) {
        //     for (int j = 0; j < row.length; j++) {
        //         System.out.print(row[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // // PrintListinReverse
        // ListNode first = new ListNode("1", new ListNode("2", new ListNode("3")));
        // Recursion.printListInReverse(first);
        // System.out.println();

        // ScavHunt
        int[] times = {5, 9, 11, 12, 14, 16, 17, 20, 24, 25, 29, 30, 33, 34, 39, 41, 45, 46, 47, 50, 57, 59, 61, 64, 65, 71, 74, 75, 76, 77, 79, 82, 85, 86, 88, 90, 92, 93, 98, 100};
		int[] points = {8,2,8,8,9,1,5,6,5,8,4,7,8,3,1,7,8,8,4,2,8,9,2,1,4,5,6,1,3,6,6,6,10,2,3,10,4,3,2,9};
        System.out.println(Recursion.scavHunt(times, points));
    }
}
