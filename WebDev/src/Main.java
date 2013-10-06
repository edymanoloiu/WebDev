import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	
	public double add_two(int x) {
		return x + 2;
	}
	
	public double sqrt(int x) {
		return Math.sqrt(x);
	}
	public double divide_by_five(int x) {
		return x / 5;
	}
	public double multiply_by_four(int x) {
		return x * 4;
	}
	public double substract_ten(int x) {
		return x - 10;
	}
	public double squered(int x) {
		return Math.pow(x, 2);
	}

	public double parseFunction(String function, int val) {
		if (function.equals("sqrt"))
			return sqrt(val);
		if(function.equals("add_two"))
			return add_two(val);
		if(function.equals("squered"))
			return squered(val);
		if(function.equals("substract_ten"))
			return substract_ten(val);
		if(function.equals("multiply_by_four"))
			return multiply_by_four(val);
		if(function.equals("divide_by_five"))
			return divide_by_five(val);
		return Integer.MIN_VALUE;
	}

	public static void main(String[] args) {
		Main process = new Main();
		int x = 25;
		LinkedList<String> functions = new LinkedList<>();
		LinkedList<Double> results = new LinkedList<>();
		functions.add("add_two");
		functions.add("multiply_by_four");
		functions.add("sqrt");
		for (String function : functions) {
			results.add(process.parseFunction(function, x));
		}
		System.out.println(results);
		functions.add("substract_ten");
		functions.add("divide_by_five");
		functions.add("squered");
		functions.add("no_existing_function");
		for (String function : functions) {
			results.add(process.parseFunction(function, x));
		}
		System.out.println(results);

	}
}
