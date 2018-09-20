package org.Behavioral.model.chainOfResponsibility;

public class ChainOfResponsibilityPattern {
	
	
	
	/*责任链模式
	 * 
	 * 定义：
	 * 
	 *
	 *
	 *
	 * 应用： tomcat 中的filter,dubbo 中的Filter封装成 Invoker
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		Handler loginHandler = new LoginHandler(new ConcreteHandler());
		loginHandler.handleRequest(new Request());
		
	}

}
