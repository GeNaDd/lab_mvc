package com.example.demo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)

public class ElementAlreadyExistException extends BaseException {
    private static String template="Element with id @s already exist.";
    public ElementAlreadyExistException(Integer elementId){
        super(String.format(template,elementId));
    }
}
