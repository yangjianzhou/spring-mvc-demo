package com.iwill.mvc;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    Logger logger = Logger.getLogger(UserController.class);

    @RequestMapping("register")
    public String register() {
        logger.info("invoke register");
        return "user/register";
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView createUser(User user) {
        System.out.println(new Gson().toJson(user));
        ModelAndView mav = new ModelAndView();
        mav.setViewName("user/createSuccess");
        mav.addObject("user", user);
        return mav;
    }
}
