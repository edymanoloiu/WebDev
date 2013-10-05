import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public double parseFunction(String function, int val) {
		if (function.equals("sqrt"))
			return Math.sqrt(val);
		else {
			StringTokenizer stringTokenizer = new StringTokenizer(function,
					"+/*-^");
			int x = Integer.parseInt(stringTokenizer.nextToken());
			if(function.contains("/"))		
				return val / x;
			else
				if(function.contains("*"))
					return val * x;
				else
					if(function.contains("^"))
						return Math.pow(val, x);
					else 
						if(function.contains("+"))
							return val + x;
						else 
							return val - x;
		}
		

	}

	public static void main(String[] args) {
		int x = 25;
		LinkedList<String> functions = new LinkedList<>();
		functions.add("+2");
		functions.add("*10");
		functions.add("-4");
		functions.add("sqrt");
		functions.add("/5");
		functions.add("^2");
		for (String function : functions) {
			System.out.println(new Main().parseFunction(function, x));
		}

	}
}
