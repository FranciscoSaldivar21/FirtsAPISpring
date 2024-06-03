package com.schoolapi.schoolapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.schoolapi.schoolapi.models.Student;
import com.schoolapi.schoolapi.services.IStudentService;




@RestController
public class StudentsController {
    private IStudentService studentService;
    
    @Autowired
    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getAll() {
        return this.studentService.getAll();
    }

    @GetMapping("/student")
    public Student getById(@RequestParam(name = "id", defaultValue = "0", required = true) int id) {
        //int id = 0;
        System.out.println(id);
        try {
            //id = Integer.parseInt(request.getParameter("id"));
        } catch (Exception e) {
            // TODO: handle exception
        }

        return studentService.getById(id);
    }
    
    
}
