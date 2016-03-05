package appcontroller;

import java.util.HashMap;
import java.util.Scanner;

public class RunApplication {

	public static void main(String[] args) {
		ApplicationController theController = new ApplicationController();
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("First number: ");
		int firstNum = Integer.parseInt(userInput.nextLine());
		System.out.print("Operator (+, -, *, /): ");
		String cmd = userInput.nextLine();
		System.out.print("Second number: ");
		int secondNum = Integer.parseInt(userInput.nextLine());
		userInput.close();
		
		HashMap<String, Integer> parameters = new HashMap<String, Integer>();
		parameters.put("firstNum", firstNum);
		parameters.put("secondNum", secondNum);
		
		theController.handleRequest(cmd, parameters);
		
	}

}
