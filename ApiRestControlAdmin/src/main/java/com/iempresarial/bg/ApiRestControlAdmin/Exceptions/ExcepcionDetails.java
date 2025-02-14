package com.iempresarial.bg.ApiRestControlAdmin.Exceptions;

//@Data

public class ExcepcionDetails {

    private String errorCode;
    private String errorUserMessage;
    private String errorSeverity;

    public ExcepcionDetails(String errorCode, String errorUserMessage, String errorSeverity) {
        this.errorCode = errorCode;
        this.errorUserMessage = errorUserMessage;
        this.errorSeverity = errorSeverity;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorUserMessage() {
        return errorUserMessage;
    }

    public void setErrorUserMessage(String errorUserMessage) {
        this.errorUserMessage = errorUserMessage;
    }

    public String getErrorSeverity() {
        return errorSeverity;
    }

    public void setErrorSeverity(String errorSeverity) {
        this.errorSeverity = errorSeverity;
    }

}
