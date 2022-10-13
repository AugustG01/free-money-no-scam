package com.example.freemoneynoscam.services;

import com.example.freemoneynoscam.repository.WriteToDatabase;
import org.springframework.web.context.request.WebRequest;

public class ValidateEmailService {
    private WriteToDatabase database = new WriteToDatabase();
    public boolean isEmailValid(String email){
        //TODO implement logic such that we verify an e-mail is valid
        return true;
    }

    public void create(WebRequest req){

        String getEmail = req.getParameter("email");
        database.create(getEmail);
    }
}
