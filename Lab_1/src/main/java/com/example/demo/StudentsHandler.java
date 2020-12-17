package com.example.demo;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.demo.BaseException;
import com.example.demo.ElementNotFoundExeption;
import com.example.demo.ElementAlreadyExistException;


public class StudentsHandler {
    private List<Student>students=new LinkedList<>();
    public void addStudent(Student student) throws ElementAlreadyExistException{
        Optional<Student>existStudent=students.stream().filter(e-> e.getId()==student.getId()).findFirst();
        if(existStudent.isPresent()){
            throw new ElementAlreadyExistException(student.getId());
        }
        students.add(student);
    }
    public List<Student>getStudents(){
        return students;
    }
    public Student getStudentById(Integer id)throws ElementNotFoundExeption{
        Optional<Student> student= students.stream().filter(e-> e.getId()==id).findFirst();
        if(!student.isPresent()){
            throw new ElementNotFoundExeption(id);
        }
        return student.get();
    }
}
