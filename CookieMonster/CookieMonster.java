import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Stack;

// You are allowed (and expected!) to use either Java's ArrayDeque or LinkedList class to make stacks and queues


public class CookieMonster {

    private int [][] cookieGrid;
    private int numRows;
    private int numCols;
    
    //Constructs a CookieMonster from a file with format:
    //numRows numCols
    //<<rest of the grid, with spaces in between the numbers>>
    public CookieMonster(String fileName) {
		int row = 0;
		int col = 0;
		try
		{
			Scanner input = new Scanner(new File(fileName));

			numRows    = input.nextInt();  
			numCols    = input.nextInt();
			cookieGrid = new int[numRows][numCols];

			for (row = 0; row < numRows; row++) 
				for (col = 0; col < numCols; col++)
					cookieGrid[row][col] = input.nextInt();
			
			input.close();
		}
		catch (Exception e)
		{
			System.out.print("Error creating maze: " + e.toString());
			System.out.println("Error occurred at row: " + row + ", col: " + col);
		}

    }

    public CookieMonster(int [][] cookieGrid) {
        this.cookieGrid = cookieGrid;
        this.numRows    = cookieGrid.length;
        this.numCols    = cookieGrid[0].length;
    }

    //You may find it VERY helpful to write this helper method.  Or not!
	private boolean validPoint(int row, int col) {
		if (row >= numRows - 1 || col >= numCols - 1 || col < 0 || row < 0 || cookieGrid[row][col] == -1) {
			return false;
		}
		return true;
	}
	
	/* RECURSIVELY calculates the route which grants the most cookies.
	 * Returns the maximum number of cookies attainable. */
	public int recursiveCookies() {
		return recursiveCookies(0,0);	
	}	
	
	// Returns the maximum number of cookies edible starting from (and including) cookieGrid[row][col]
	public int recursiveCookies(int row, int col) {
		int cookies = cookieGrid[row][col];
		if (!validPoint(row, col)) {
			return 0;
		}
		int right = recursiveCookies(row, col + 1);
		int down  = recursiveCookies(row + 1, col);

		return cookieGrid[row][col] + Math.max(right, down);
	}
	

	/* Calculate which route grants the most cookies using a QUEUE.
	 * Returns the maximum number of cookies attainable. */
    /* From any given position, always add the path right before adding the path down */
    public int queueCookies() {
		int cookies = 0;
		Queue<OrphanScout> orphans = new ArrayDeque<OrphanScout>();
		orphans.offer(new OrphanScout(0, 0, cookieGrid[0][0]));
		while (!orphans.isEmpty()) {
			int row = orphans.peek().getEndingRow();
			int col = orphans.peek().getEndingCol();
			if (validPoint(row, col + 1)) {
				orphans.offer(new OrphanScout(row, col + 1, orphans.peek().getCookiesDiscovered() + cookieGrid[row][col + 1]));
			}
			if (validPoint(row + 1, col)) {
				orphans.offer(new OrphanScout(row + 1, col, orphans.peek().getCookiesDiscovered() + cookieGrid[row + 1][col]));
			}
			if (!validPoint(row + 1, col + 1)) {
				cookies = Math.max(cookies, orphans.peek().getCookiesDiscovered());
			}
			orphans.poll();
		}
		return cookies;
    }

    
    /* Calculate which route grants the most cookies using a stack.
 	 * Returns the maximum number of cookies attainable. */
    /* From any given position, always add the path right before adding the path down */
    public int stackCookies() {
		int cookies = 0;
		Stack<OrphanScout> orphans = new Stack<OrphanScout>();
		orphans.push(new OrphanScout(0, 0, cookieGrid[0][0]));
		while (!orphans.empty()) {
			OrphanScout clone = orphans.pop();
			int row = clone.getEndingRow();
			int col = clone.getEndingCol();
			int cookiesDiscovered = clone.getCookiesDiscovered();
			if (validPoint(row, col + 1)) {
				orphans.push(new OrphanScout(row, col + 1, cookiesDiscovered + cookieGrid[row][col + 1]));
			}
			if (validPoint(row + 1, col)) {
				orphans.push(new OrphanScout(row + 1, col, cookiesDiscovered + cookieGrid[row + 1][col]));
			}
			if (!validPoint(row + 1, col + 1)) {
				cookies = Math.max(cookies, cookiesDiscovered);
			}
		}
		return cookies;
    }

}
