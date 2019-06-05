package com.example.demo.Handler;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author jcb
 * @version : LoginSuccessHandler, v 0.1 2019/6/4 16:29 jcb Exp$
 * @Description: 登录成功处理
 */
@Component
public class LoginSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {

        httpServletResponse.setContentType("application/json;charset=UTF-8");

        httpServletResponse.getWriter().write(authentication.getName());
    }
}
