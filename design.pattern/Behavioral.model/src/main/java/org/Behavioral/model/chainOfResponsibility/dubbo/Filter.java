package org.Behavioral.model.chainOfResponsibility.dubbo;

import org.Behavioral.model.chainOfResponsibility.Response;

public interface Filter {
	
	
	//next Invoker 代表
	Response invoke(Invoker<?> invoker, Invocation invocation);

}
