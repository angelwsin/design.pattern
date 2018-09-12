package org.Behavioral.model.chainOfResponsibility.tomcat;

import org.Behavioral.model.chainOfResponsibility.Request;
import org.Behavioral.model.chainOfResponsibility.Response;

public interface FilterChain {
	
	
	
	public void doFilter(Request request, Response response);

}
