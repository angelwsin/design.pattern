package org.Behavioral.model.chainOfResponsibility.dubbo;

import org.Behavioral.model.chainOfResponsibility.Response;

public class TpsLimitFilter implements Filter{

	public Response invoke(Invoker<?> invoker, Invocation invocation) {
		//逻辑处理
		//调用下一个filter
		return invoker.invoke(invocation);
	}

}
