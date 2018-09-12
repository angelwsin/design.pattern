package org.Behavioral.model.chainOfResponsibility.tomcat;

import org.Behavioral.model.chainOfResponsibility.Request;
import org.Behavioral.model.chainOfResponsibility.Response;

public interface Filter {
	
	
	
	
	public void doFilter(Request request,Response response,
            FilterChain chain);

}
