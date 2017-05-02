package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/user")
public class UserController {

    @RequestMapping(value={"/", ""}, method = RequestMethod.GET)// , method = RequestMethod.GET
    public ModelAndView adminPage() {
        ModelAndView view = new ModelAndView();

        view.setViewName("user");
        return view;
    }
}
