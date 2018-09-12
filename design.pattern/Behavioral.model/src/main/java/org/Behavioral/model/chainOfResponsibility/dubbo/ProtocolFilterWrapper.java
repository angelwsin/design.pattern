package org.Behavioral.model.chainOfResponsibility.dubbo;

import java.util.List;

import org.Behavioral.model.chainOfResponsibility.Response;

public class ProtocolFilterWrapper {
	
	
	
	/*
	 *            ___________
	 *           |           |
	 *           | Invoker   |--------------最终的Invoke
	 *           |___________|
	 * 
	 *               .....
	 *            ___________
	 *           |           |
	 *           | Invoker   |
	 *           |___________|
	 *                |
	 *            ____|______
	 *           |           | 
	 *           |  Filter   |
	 *           |___________|
	 *                | 
	 *                |
	 *            ____|______
	 *           |           |
	 *           | Invoker   |-----------------head
	 *           |___________|
	 * 
	 * 
	 */
	
	
	public static <T> Invoker<T> buildInvokerChain(final Invoker<T> invoker, String key, String group) {
        Invoker<T> last = invoker;
        List<Filter> filters = null;//框架加载//ExtensionLoader.getExtensionLoader(Filter.class).getActivateExtension(invoker.getUrl(), key, group);
        if (filters.size() > 0) {
        	
        	//使用 Invoker 链接起调用的过滤器
            for (int i = filters.size() - 1; i >= 0; i --) {
                final Filter filter = filters.get(i);
                final Invoker<T> next = last;
                last = new Invoker<T>() {
                  
                    public Response invoke(Invocation invocation) {
                        return filter.invoke(next, invocation);
                    }
                   
                    @Override
                    public String toString() {
                        return invoker.toString();
                    }
                };
            }
        }
        return last;
    }
	
	public static void main(String[] args) {
		DubboInvoker<?> invoker  = new DubboInvoker();
		Invoker<?> inv = ProtocolFilterWrapper.buildInvokerChain(invoker, "key", "group");
		//调用链
		inv.invoke(new Invocation() {
			
			public Invoker<?> getInvoker() {
				return null;
			}
		});
		
	}

}
