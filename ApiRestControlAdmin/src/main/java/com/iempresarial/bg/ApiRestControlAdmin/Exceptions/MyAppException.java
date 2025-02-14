package com.iempresarial.bg.ApiRestControlAdmin.Exceptions;

public class MyAppException extends Exception {

    private ExcepcionDetails details;

    public MyAppException(String message, ExcepcionDetails details, Throwable e) {
        super(message, e);
        setDetails(details);
    }

    public MyAppException(String message, ExcepcionDetails details) {
        super(message);
        setDetails(details);
    }

    public ExcepcionDetails getDetails() {
        return details;
    }

    public void setDetails(ExcepcionDetails details) {
        this.details = details;
    }

}
