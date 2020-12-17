package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ElementNotFoundExeption extends BaseException{
    private static String template="Element with id @s was not found.";
    public ElementNotFoundExeption(Integer elementId){
        super(String.format(template,elementId));
    }
}
