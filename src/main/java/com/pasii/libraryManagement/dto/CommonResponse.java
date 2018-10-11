package com.pasii.libraryManagement.dto;

/**
 * Created by pasindum on 11/10/2018.
 */
public class CommonResponse {

    String statusCode;
    String statusDescription;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }
}
