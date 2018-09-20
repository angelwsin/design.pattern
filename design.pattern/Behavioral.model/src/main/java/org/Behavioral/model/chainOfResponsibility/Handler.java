package org.Behavioral.model.chainOfResponsibility;

public abstract class Handler {
	
	
	private Handler nextHandler;
	
	
	
	public Handler(Handler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}


	

	public Handler getNextHandler() {
		return nextHandler;
	}




	abstract Response handleRequest(Request request);

}
