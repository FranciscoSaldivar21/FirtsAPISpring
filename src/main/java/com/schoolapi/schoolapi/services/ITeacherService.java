package com.schoolapi.schoolapi.services;

import java.util.List;

import com.schoolapi.schoolapi.models.Teacher;

public interface ITeacherService {
    List<Teacher> getAll();
    Teacher getById(Integer id);
}
