package com.bramborovym.springmvcangularjs.controller;

/**
 * Created by Exilion on 2016-10-30.
 */


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/home")
public class HomeController {


    @RequestMapping("/layout")
    public String getRailwayStationPartialPage(ModelMap modelMap) {
        return "home/layout";
    }
}
