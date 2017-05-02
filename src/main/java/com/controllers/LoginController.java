package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping(value="/login", method = RequestMethod.GET)// , method = RequestMethod.GET
    public ModelAndView login(
            @RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout) {

        ModelAndView view = new ModelAndView();
        if (error != null) {
            view.addObject("error", "Invalid username and password!");
        }

        if (logout != null) {
            view.addObject("msg", "You've been logged out successfully.");
        }
        view.setViewName("login");

        return view;
    }

//    @RequestMapping(value={"/admin**", "/admin/"}, method = RequestMethod.GET)// , method = RequestMethod.GET
//    public ModelAndView adminPage() {
//        ModelAndView view = new ModelAndView();
//
//        view.setViewName("admin");
//        return view;
//    }

//    @RequestMapping(value="/user**", method = RequestMethod.GET)// , method = RequestMethod.GET
//    public ModelAndView userPage() {
//        ModelAndView view = new ModelAndView();
//
//        view.setViewName("user");
//        return view;
//    }
}
