package com.cun.filters;

import com.cun.main.FilterChain;
import com.cun.main.Request;
import com.cun.main.Response;

public class FirstFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {

        request.doSomething(this.getClass().getName());

        // 先执行所有request再倒序执行所有response
        chain.doFilter(request, response, chain);

        response.doSomething(this.getClass().getName());
    }
}
