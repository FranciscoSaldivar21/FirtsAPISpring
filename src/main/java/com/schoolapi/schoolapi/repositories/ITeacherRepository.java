package com.schoolapi.schoolapi.repositories;

import java.util.List;

import com.schoolapi.schoolapi.models.Teacher;


public interface ITeacherRepository {
    List<Teacher> getAll();
    Teacher getById(Integer id);
}
