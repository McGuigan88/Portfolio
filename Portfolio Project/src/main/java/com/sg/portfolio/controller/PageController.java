package com.sg.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class PageController {


    @GetMapping("about")
    public String displayProfile() {

        return "about";
    }

    @GetMapping("index")
    public String displayHomePage(){
        return "index";
    }

    @GetMapping("bankAppDetails")
    public String displayBankApp(){

        return "bankAppDetails";
    }

    @GetMapping("superheroDetails")
    public String displaySuperheroApp(){

        return "superheroDetails";
    }

    @RequestMapping("/linkedin")
    public RedirectView localRedirect() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://www.linkedin.com/in/ryan-mcguigan1");
        return redirectView;
    }

    @RequestMapping("/githubBankApp")
    public RedirectView githubRedirect1() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://github.com/McGuigan88/Bank-App.git");
        return redirectView;
    }

    @RequestMapping("/githubSuperheroes")
    public RedirectView githubRedirect2() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://github.com/McGuigan88/Superhero-Sightings-Spring-boot-Full-Stack-Web-App.git");
        return redirectView;
    }

}
