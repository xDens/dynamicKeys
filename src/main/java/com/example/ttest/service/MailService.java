package com.example.ttest.service;

import com.example.ttest.model.Data;
import com.example.ttest.model.OResponse;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    public OResponse sendEmail(Data formData) {
        String statusMessage = "Data has been received: " + formData.toString();

        //DO THE JOB HERE: call LS-API and etc.

        return new OResponse(statusMessage);
    }
}
