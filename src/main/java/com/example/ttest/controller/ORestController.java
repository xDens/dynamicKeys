package com.example.ttest.controller;

import com.example.ttest.model.Data;
import com.example.ttest.model.OResponse;
import com.example.ttest.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ORestController {

    @Autowired
    private MailService mailService;

    @PostMapping(value="/save")
    public String saveData(@RequestBody Data data) {
        OResponse response = mailService.sendEmail(data);
        //call service here and send a message back;
        return response.getStatusMessage();
    }
}
