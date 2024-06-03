package com.schoolapi.schoolapi.repositories;

import java.util.List;

import com.schoolapi.schoolapi.models.Student;

public interface IStudentRepository {
    List<Student> getAll();
    Student getById(Integer id);
}
