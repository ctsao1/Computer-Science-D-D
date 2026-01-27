import java.util.ArrayList;;

public class Arithmetic {

	//Evaluates a String exp that has an arithmetic expression, written in classic notation
	public static int evaluate(String exp) {
		String str = Arithmetic.convertClassicToStout(exp);
		return Arithmetic.evaluateStout(str);
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
			return operand1 ^ operand2;
		}
		if (operation.equals("%")) {
			return operand1 % operand2;
		}
		else {
			return operand1 / operand2;
		}
	}
	
	//Evaluates a String exp that has an arithmetic expression written in STOUT notation
	public static int evaluateStout(String exp) {
		String ops = "+-*^/%*";
		String[] temp = exp.split(" ");
		ArrayList<String> expr = new ArrayList<String>();
		for (int i = 0; i < temp.length; i++) {
			expr.add(temp[i]);
		}
		int i = 0;
		while (expr.size() > 1) {
			if (ops.indexOf(expr.get(i)) != -1) {
				expr.add(i + 1, String.valueOf(Arithmetic.operate(Integer.parseInt(expr.get(i - 2)), Integer.parseInt(expr.get(i - 1)), expr.get(i))));
				expr.remove(i - 2);
				expr.remove(i - 2);
				expr.remove(i - 2);
				i = 0;
			}
			i++;
		}
		return Integer.parseInt(expr.get(0));
	}
	
	public static String convertClassicToStout(String exp) {
		String opValues = "4-4+5%5/5*6^9(9)";
		MyStack<String> ops = new MyStack<String>();
		StringBuilder str = new StringBuilder();
		String[] expr = exp.split(" ");
		for (int i = 0; i < expr.length; i++) {
			if (expr[i].charAt(0) >= 48 && expr[i].charAt(0) <= 57) {
				str.append(expr[i] + " ");
			} else {
				if (!ops.empty() && (opValues.charAt(opValues.indexOf(expr[i]) - 1) < opValues.charAt(opValues.indexOf(ops.peek()) - 1))) {
					if (!ops.peek().equals(")") && !ops.peek().equals("(")) {
						str.append(ops.peek() + " ");
					}
					ops.push(expr[i]);
				} else {
					if (expr[i].equals(")") && !(ops.peek().equals("(") || ops.peek().equals(")"))) {
						str.append(ops.peek() + " ");
						ops.pop();
				} else {
					ops.push(expr[i]);
					}
				}
			} 
		}
		while (!ops.empty()) {
			if (!ops.peek().equals(")") && !ops.peek().equals("(")) {
				str.append(ops.peek() + " ");
			}
			ops.pop();
		}
		return str.toString();
	}
	
	
}
