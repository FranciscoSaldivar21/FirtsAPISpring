package com.schoolapi.schoolapi.services;

import java.util.List;

import com.schoolapi.schoolapi.models.Student;

public interface IStudentService {
    List<Student> getAll();
    Student getById(Integer id);
}
