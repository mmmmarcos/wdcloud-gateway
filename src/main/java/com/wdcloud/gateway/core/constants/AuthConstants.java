package com.wdcloud.gateway.core.constants;

/**
 * 鉴权相关的常量
 *
 * @author marcos
 * @date 2019/04/22
 */
public interface AuthConstants {
    /**
     * 鉴权请求头名称
     */
    String AUTH_HEADER = "Authorization";

    /**
     * 鉴权地址
     */
    String AUTH_ACTION_URL = "/gatewayAction/auth";

    /**
     * 检验token是否正确
     */
    String VALIDATE_TOKEN_URL = "/gatewayAction/validateToken";

    /**
     * 退出接口
     */
    String LOGOUT_URL = "/gatewayAction/logout";
}
