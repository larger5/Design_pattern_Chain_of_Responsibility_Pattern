package com.cun.main;

import com.cun.filters.FirstFilter;
import com.cun.filters.SecondFilter;
import com.cun.filters.ThirdFilter;
import org.junit.Test;

public class FilterTest {

    @Test
    public void Test(){
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new FirstFilter()).addFilter(new SecondFilter()).addFilter(new ThirdFilter());
        filterChain.doFilter(new Request(),new Response(),filterChain);
    }

}
