package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.Student;
import com.example.demo.StudentsHandler;
import com.example.demo.ElementNotFoundExeption;
import com.example.demo.ElementAlreadyExistException;
import com.example.demo.BaseException;
import com.example.demo.StudentsController;
import com.example.demo.DemoApplication;



@Controller
public class StudentsController {
@Autowired
    private StudentsHandler studentsHandler;
@RequestMapping(value ="/sudent/new", method = RequestMethod.GET)
    public String createForm(){
    return "createForm";
}
@RequestMapping(value="add",method = RequestMethod.POST)
    public ModelAndView addStudent(@ModelAttribute Student student)throws
        ElementAlreadyExistException{
    studentsHandler.addStudent(student);
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("student");
    modelAndView.addObject("student", student);
    return modelAndView;
}
    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public ModelAndView getStudentById(@PathVariable("id") int id) throws
            ElementNotFoundExeption {
        Student student = studentsHandler.getStudentById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("student");
        modelAndView.addObject("student", student);
        return modelAndView;
    }
    @ExceptionHandler(BaseException.class)
    public ModelAndView handleCustomExceptions(BaseException ex) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        modelAndView.addObject("message", ex.getMessage());
        return modelAndView;
    }
    @ExceptionHandler(BindException.class)
    public ModelAndView numberFormatError() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        modelAndView.addObject("message", "Error with parsing number attribute.");
        return modelAndView;
    }


}
