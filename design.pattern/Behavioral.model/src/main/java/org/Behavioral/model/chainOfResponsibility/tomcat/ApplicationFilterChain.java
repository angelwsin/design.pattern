package org.Behavioral.model.chainOfResponsibility.tomcat;

import org.Behavioral.model.chainOfResponsibility.Request;
import org.Behavioral.model.chainOfResponsibility.Response;

public class ApplicationFilterChain implements FilterChain{
	
	/**
     * The int which is used to maintain the current position
     * in the filter chain.
     */
    private int pos = 0;


    /**
     * The int which gives the current number of filters in the chain.
     */
    private int n = 0;
    
    
    //组装filters
    private ApplicationFilterConfig[] filters = new ApplicationFilterConfig[0];

	public void doFilter(Request request, Response response) {
		if (pos < n) {
            ApplicationFilterConfig filterConfig = filters[pos++];
            Filter filter= filterConfig.getFilter();
            //递归的调用过滤链
            filter.doFilter(request, response, this);
            return ;
		}
		// service()处理
		
	}
	
	
	public static void main(String[] args) {
		//模拟调用
		//每个请求创建一个 chain
		ApplicationFilterChain chain = new ApplicationFilterChain();
		chain.doFilter(new Request(), new Response());
		
	}

}
