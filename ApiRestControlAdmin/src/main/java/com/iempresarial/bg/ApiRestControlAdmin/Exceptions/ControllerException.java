package com.iempresarial.bg.ApiRestControlAdmin.Exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerException {

    private static final Logger LOG = LoggerFactory.getLogger(ControllerException.class.getName());

    @ExceptionHandler(value = { MyAppException.class })
    public ResponseEntity<ExcepcionDetails> handleMyAppException(MyAppException exception) {
        LOG.error(exception.getMessage(), exception);
        return new ResponseEntity<>(exception.getDetails(), HttpStatus.BAD_REQUEST);
    }

}
