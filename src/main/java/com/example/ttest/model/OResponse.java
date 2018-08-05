package com.example.ttest.model;

public class OResponse {

    private String statusMessage;

    public OResponse() {

    }

    public OResponse(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
}
