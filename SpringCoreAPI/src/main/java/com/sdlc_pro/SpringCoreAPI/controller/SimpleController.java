package com.sdlc_pro.SpringCoreAPI.controller;

import com.sdlc_pro.SpringCoreAPI.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SimpleController {
    @GetMapping("/form")
    public String getForm(Model model){
        model.addAttribute("userDTO", new UserDTO());
        return "form";
    }

    @PostMapping("/form")
    public String postForm(@Validated @ModelAttribute("userDTO") UserDTO userDTO, BindingResult result){
        if (result.hasErrors()){
            return "form";
        }
        return "success" ;
    }
}
