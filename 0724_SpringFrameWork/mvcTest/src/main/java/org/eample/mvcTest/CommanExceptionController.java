package org.eample.mvcTest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("org.eample.mvcTest")
public class CommanExceptionController {
    @ExceptionHandler(Exception.class)
    public String handleException(){
        return "error";
    }
}
