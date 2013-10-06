import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;

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

	public static void main(String[] args) {
		Main process = new Main();
		int x = 25;
		LinkedList<String> functions = new LinkedList<>();
		functions.add("add_two");
		functions.add("multiply_by_four");
		functions.add("sqrt");
		functions.add("substract_ten");
		functions.add("divide_by_five");
		functions.add("squered");
		functions.add("no_existing_function");

		int nrFunctions = 0;
		Method[] methods = process.getClass().getDeclaredMethods();
		for (Method method : methods) {
			if (functions.contains(method.getName())) {
				try {
					System.out.println(method.invoke(process, x));
					nrFunctions ++;
				} catch (IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		if(nrFunctions != functions.size())
			System.out.println("Some functions are inexistent");
	}
}
