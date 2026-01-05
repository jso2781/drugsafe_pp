package com.drugsafe.pp.test.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.drugsafe.pp.test.vo.UserForm;

@Controller
public class UserController {

    @GetMapping("/users/new")
    public String form(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "user-form";
    }

    @PostMapping("/users")
    public String submit(
            @Valid @ModelAttribute("userForm") UserForm form,
            BindingResult bindingResult,
            Model model
    ) {
        if (bindingResult.hasErrors()) {
            return "user-form";
        }

        model.addAttribute("name", form.getName());
        model.addAttribute("email", form.getEmail());
        return "user-success";
    }
}
