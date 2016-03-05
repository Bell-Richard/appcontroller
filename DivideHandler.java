package appcontroller;

import java.util.HashMap;

public class DivideHandler implements ACHandler {

	@Override
	public void handleIt(HashMap<?, ?> parameters) {
		int first = (int) parameters.get("firstNum");
		int second = (int) parameters.get("secondNum");
		int quotient;
		try {
			quotient = first/second;
			System.out.println(first + " / " + second + " = " + quotient);
		} catch (ArithmeticException e) {
			System.out.println("ERROR: Can't divide by 0");
		}
	}

}
