package com.jt.config;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/27 9:21
 */
public class BizInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 随便写的逻辑，总之就是拦截
        String authorization = request.getHeader("Authorization");
        if (StringUtils.isEmpty(authorization)) {
            return false;
        }
        return true;
    }
}
