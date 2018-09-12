package org.Behavioral.model.chainOfResponsibility.dubbo;

import org.Behavioral.model.chainOfResponsibility.Response;

public class DubboInvoker<T> implements Invoker<T>{

	public Response invoke(Invocation invocation) {
		//完成 tcp 请求
		return null;
	}

}
