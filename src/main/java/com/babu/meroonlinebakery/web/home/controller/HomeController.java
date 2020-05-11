/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.babu.meroonlinebakery.web.home.controller;

import com.babu.meroonlinebakery.core.controller.SiteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Babu TUl
 */
@Controller
@RequestMapping(value = "/")
public class HomeController extends SiteController{

    public HomeController() {
    pageTitle="meroEclinic";
    }
    @GetMapping
    public String index(){
        return "home/index";
    }
    @GetMapping(value = "/contact")
    public String contact(){
        return "contact/contact";
    }
    @GetMapping(value = "/menu")
    public String menu(){
        return "menu/menu";
    }
    @GetMapping(value = "/reservation")
    public String reservation(){
        return "book_a_table/reservation";
    }
    @GetMapping(value = "/about")
    public String doctors(){
        return "about/about";
    }
    @GetMapping(value = "/blog")
    public String stories(){
        return "stories/blog";
    }
    @GetMapping(value = "/admin")
    public String admin(){
        return "admin/index";
    }
    @GetMapping(value = "/bakery")
    public String bakery(){
        return "bakery/index";
    }
    @GetMapping(value = "/restaurant")
    public String restaurant(){
        return "restaurant/index";
    }
    
}
