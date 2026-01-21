
public class Arithmetic {

	//Evaluates a String exp that has an arithmetic expression, written in classic notation
	public static int evaluate(String exp) {
		String[] str = exp.split(" ");
		return operate(Integer.parseInt(str[0]), Integer.parseInt(str[2]), str[1]);
	}
	
	//Returns the result of doing operand1 operation operand2,
	//e.g. operate(5, 2, "-") should return 3
	public static int operate(int operand1, int operand2, String operation) {
		if (operation.equals("+")) {
			return operand1 + operand2;
		}
		if (operation.equals("-")) {
			return operand1 - operand2;
		}
		if (operation.equals("*")) {
			return operand1 * operand2;
		}
		if (operation.equals("^")) {
			return operand1^operand2;
		}
		else {
			return operand1 / operand2;
		}
	}
	
	//Evaluates a String exp that has an arithmetic expression written in STOUT notation
	public static int evaluateStout(String exp) {
		return 0;
	}
	
	public static String convertClassicToStout(String exp) {
		return "";
	}
	
	
}
