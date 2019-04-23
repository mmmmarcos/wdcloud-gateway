package com.wdcloud.gateway.core.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.wdcloud.gateway.core.constants.AuthConstants;
import com.wdcloud.gateway.core.constants.ZuulFiltersOrder;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;



/**
 * 请求路径权限过滤器
 *
 * @author marcos
 * @date 2017-11-14-上午10:43
 */
@Slf4j
public class PathMatchFilter extends ZuulFilter {


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return ZuulFiltersOrder.PATH_MATCH_FILTER_ORDER;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();

        //登陆接口和验证token放过资源过滤
        if (request.getServletPath().equals(AuthConstants.AUTH_ACTION_URL) ||
                request.getServletPath().equals(AuthConstants.VALIDATE_TOKEN_URL)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object run() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();

        String requestUri = request.getRequestURI();
        String servletPath = request.getServletPath();
        log.info(requestUri);
        return null;
//        ResourceDefinition currentResource = resourceServiceConsumer.getResourceByUrl(requestUri);
//        if (currentResource == null) {
//            return null;
//        } else {
//            //判断如果本接口不需要登录直接略过,不登录获取不到用户token
//            if (!currentResource.getRequiredLogin()) {
//                return null;
//            }
//            //判断本接口是否需要url资源过滤
//            if (currentResource.getRequiredPermission()) {
//                final String sysToken = request.getHeader(AUTH_HEADER);
//                Set<Object> permissionUrls = authServiceConsumer.getLoginUserByToken(sysToken).getResourceUrls();
//                boolean hasPermission = permissionUrls.contains(servletPath);
//                if (hasPermission) {
//                    return null;
//                } else {
//                    throw new ServiceException(GateWayExceptionEnum.NO_PERMISSION);
//                }
//            } else {
//                return null;
//            }
//        }
    }
}
