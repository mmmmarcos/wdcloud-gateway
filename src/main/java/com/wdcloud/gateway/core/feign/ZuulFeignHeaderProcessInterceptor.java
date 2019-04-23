/*
package com.wdcloud.gateway.core.feign;

import com.wdcloud.core.feign.FeignHeaderProcessInterceptor;
import com.wdcloud.model.constants.RosesConstants;
import feign.RequestTemplate;
import com.netflix.zuul.context.RequestContext;

*/
/**
 * zuul对feign拦截器的拓展
 *
 * @author marcos
 * @date 2018/04/22
 *//*

public class ZuulFeignHeaderProcessInterceptor extends FeignHeaderProcessInterceptor {

    @Override
    public void addOtherHeaders(RequestTemplate requestTemplate) {
        RequestContext currentContext = RequestContext.getCurrentContext();
        Object contextObject = currentContext.get(RosesConstants.REQUEST_NO_HEADER_NAME);
        requestTemplate.header(RosesConstants.REQUEST_NO_HEADER_NAME, contextObject == null ? "" : contextObject.toString());
    }
}
*/
