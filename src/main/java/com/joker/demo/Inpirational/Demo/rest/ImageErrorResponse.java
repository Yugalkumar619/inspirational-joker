package com.joker.demo.Inpirational.Demo.rest;

import com.joker.demo.Inpirational.Demo.entity.Image;

public class ImageErrorResponse {

    private int status;

    private String message;

    private Boolean success;

    private Image data;

    public ImageErrorResponse(){

    }

    public ImageErrorResponse(int status, String message, Boolean success, Image data) {
        this.status = status;
        this.message = message;
        this.success = success;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Image getData() {
        return data;
    }

    public void setData(Image data) {
        this.data = data;
    }
}
