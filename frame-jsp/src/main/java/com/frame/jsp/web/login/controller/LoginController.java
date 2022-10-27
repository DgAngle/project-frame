package com.frame.jsp.web.login.controller;

import com.frame.jsp.common.jspPage.JspUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author gqshuang
 * @version 1.0
 * @date 2022/10/27 10:36
 */
@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping({"", "/login"})
    public String openLogin() {
        logger.info("进入登录页");
        return JspUtil.PAGE_PATH + "/login/login";
    }
}
