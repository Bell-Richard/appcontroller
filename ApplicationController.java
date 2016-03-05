package appcontroller;

import java.util.HashMap;

public class ApplicationController {

	private HashMap<String, ACHandler> handlerMap = new HashMap<String, ACHandler>();
	
	public void handleRequest(String cmd, HashMap<String, ?> parameters) throws NullPointerException {
		ACHandler aHandler = (ACHandler) handlerMap.get(cmd);
		aHandler.handleIt(parameters);
	}
	
	public ApplicationController() {
		handlerMap.put("+", new AddHandler());
		handlerMap.put("-", new SubtractHandler());
		handlerMap.put("*", new MultiplyHandler());
		handlerMap.put("/", new DivideHandler());
	}
}
