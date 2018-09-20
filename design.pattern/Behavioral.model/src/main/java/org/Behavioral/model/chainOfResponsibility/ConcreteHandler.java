package org.Behavioral.model.chainOfResponsibility;

public class ConcreteHandler extends Handler{

	public ConcreteHandler(Handler nextHandler) {
		super(nextHandler);
	}
	
	public ConcreteHandler() {
		super(null);
	}

	@Override
	Response handleRequest(Request request) {
		return null;
	}

}
