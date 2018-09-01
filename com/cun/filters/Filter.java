package com.cun.filters;

import com.cun.main.FilterChain;
import com.cun.main.Request;
import com.cun.main.Response;

public interface Filter {
    void doFilter(Request request, Response response, FilterChain chain);
}
