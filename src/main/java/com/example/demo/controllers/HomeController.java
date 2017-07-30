package com.example.demo.controllers;

import com.example.demo.services.city.CityService;
import org.pac4j.core.exception.HttpAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class HomeController {


    @Autowired
    private CityService cityService;

    @RequestMapping("/index")
    @ResponseBody
    public Object index(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) throws HttpAction {
        System.out.println("kevin1");
        return cityService.getCityById(1);
    }

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", "Hello Spring Boot with Tiles");
        return "welcome";
    }
}
