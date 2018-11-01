package com.task.testing.controllers;

import com.task.testing.models.User;
import com.task.testing.models.UserLoginModels;
import com.task.testing.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    private String LoginAccess(ModelMap modelMap, HttpServletRequest request,
                               @RequestParam("username") String name, @RequestParam("pass") String pass) {

        boolean isValid = true;
        if (StringUtils.isBlank(name)) {
            modelMap.put("loginError", "name is not valid");
            isValid = false;
        }
        if (StringUtils.isBlank(name)) {
            modelMap.put("passError", "pass is not valid");
            isValid = false;
        }
        if (isValid) {
            UserLoginModels userLoginModels = new UserLoginModels(name, pass);
            User user = userService.getUserFromUserLogin(userLoginModels);
        }
        String referer = request.getHeader("referer")
                .replaceAll("http://", "")
                .replace(request.getServerName() + ":", "")
                .replace(String.valueOf(request.getServerPort()), "");


        return request.getPathInfo();
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    private String showLogin(ModelMap modelMap) {
        modelMap.addAttribute("user", new UserLoginModels());
        return "login";
    }
}
