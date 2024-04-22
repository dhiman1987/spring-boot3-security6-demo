package com.dhimantalapatra.spring.security.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
public class HomeController {

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    @GetMapping("/home")
    public ModelAndView home(){
        logger.debug("Accessing home request mapping");
        ModelAndView mav =  new ModelAndView("home");
        mav.addObject("message",
                String.format("The server time is %s.",LocalDateTime.now()));
        return mav;
    }
}
