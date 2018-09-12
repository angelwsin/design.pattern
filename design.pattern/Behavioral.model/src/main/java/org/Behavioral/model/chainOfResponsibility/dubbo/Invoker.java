package org.Behavioral.model.chainOfResponsibility.dubbo;

import org.Behavioral.model.chainOfResponsibility.Response;

public interface Invoker<T> {
	
	
	
	 Response invoke(Invocation invocation);

}
