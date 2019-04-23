/*
package com.wdcloud.gateway.core.filter;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.wdcloud.gateway.core.constants.ZuulFiltersOrder;
import com.wdcloud.model.constants.RosesConstants;

import javax.servlet.http.HttpServletResponse;

*/
/**
 * requestNo生成过滤器
 *
 * @author marcos
 * @date 2019/04/22
 *//*

public class RequestNoGenerateFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return ZuulFiltersOrder.REQUEST_NO_GENERATE_FILTER_ORDER;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletResponse response = currentContext.getResponse();
        //生成唯一请求号uuid
        String requestNo = IdWorker.getIdStr();
        currentContext.set(RosesConstants.REQUEST_NO_HEADER_NAME, requestNo);
        currentContext.addZuulRequestHeader(RosesConstants.REQUEST_NO_HEADER_NAME, requestNo);
        response.addHeader(RosesConstants.REQUEST_NO_HEADER_NAME, requestNo);
        return null;
    }
}
*/
