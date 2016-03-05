package appcontroller;

import java.util.HashMap;

public class MultiplyHandler implements ACHandler {

	@Override
	public void handleIt(HashMap<?, ?> parameters) {
		int first = (int) parameters.get("firstNum");
		int second = (int) parameters.get("secondNum");
		int product = first*second;
		System.out.println(first + " * " + second + " = " + product);
	}

}
