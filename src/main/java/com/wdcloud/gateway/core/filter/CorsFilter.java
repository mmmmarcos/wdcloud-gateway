package com.wdcloud.gateway.core.filter;

import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 跨域设置
 *
 * @author marcos
 * @date 2018-08-29
 */
@Component
public class CorsFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request = (HttpServletRequest) req;
        String currentOrigin = request.getHeader("Origin");
        if (!StrUtil.isEmpty(currentOrigin)) {
            response.setHeader("Access-Control-Allow-Origin", currentOrigin);
        }
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, DELETE, OPTIONS, DELETE");
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, x-requested-with, X-Custom-Header, application/x-www-form-urlencoded,Authorization");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setDateHeader("Expires", 0);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
