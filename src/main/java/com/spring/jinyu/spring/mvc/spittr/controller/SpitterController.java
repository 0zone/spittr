package com.spring.jinyu.spring.mvc.spittr.controller;

import com.spring.jinyu.spring.mvc.spittr.bean.Spitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value = "/spitter")
public class SpitterController {

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String showRegisterForm() {
        return "registerForm";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String processRegister(Spitter spitter) {

        return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(value="/{username}", method=GET)
    public String showSpitter(@PathVariable String username, Model model) {
        Spitter spitter = new Spitter(0L, username, "123456", "jinyu", "jinyu", "jinyu@spittr.com");
        System.out.println(spitter.getUsername());
        model.addAttribute(spitter);
        return "profile";
    }
}
