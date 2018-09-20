package org.Behavioral.model.chainOfResponsibility;

public class LoginHandler extends Handler{

	public LoginHandler(Handler nextHandler) {
		super(nextHandler);
	}

	@Override
	Response handleRequest(Request request) {
		return null;
	}

}
