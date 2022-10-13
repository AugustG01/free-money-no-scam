package com.example.freemoneynoscam.controllers;

import com.example.freemoneynoscam.repository.WriteToDatabase;
import com.example.freemoneynoscam.services.ValidateEmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@Controller
public class IndexController {

    private WriteToDatabase database = new WriteToDatabase();
    private ValidateEmailService validate = new ValidateEmailService();
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/test")
    public String test(WebRequest dataFromForm){
        validate.create(dataFromForm);

        System.out.println(dataFromForm.getParameter("email"));
        return "redirect:/succes";
    }

    @GetMapping("/succes")
    public String succes(){
        return "succes";
    }
}
