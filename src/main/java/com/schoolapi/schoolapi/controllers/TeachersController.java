package com.schoolapi.schoolapi.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.schoolapi.schoolapi.models.Teacher;
import com.schoolapi.schoolapi.services.ITeacherService;

import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class TeachersController {
    ITeacherService teacherService;

    public TeachersController(ITeacherService teacherService){
        this.teacherService = teacherService;
    }

    @GetMapping("/teachers")
    public List<Teacher> getAllTeachers() {
        return teacherService.getAll();
    }

    @GetMapping("/teacher")
    public Teacher getById(HttpServletRequest request){
        int id = 0;

        try {
            id = Integer.parseInt(request.getParameter("id"));    
        } catch (Exception e) {
            // TODO: handle exception
        }

        return teacherService.getById(id);
    }
    
}
