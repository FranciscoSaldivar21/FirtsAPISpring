package com.schoolapi.schoolapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolapi.schoolapi.repositories.IStudentRepository;
import com.schoolapi.schoolapi.models.Student;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository studentsRepository;

    public List<Student> getAll(){
        return this.studentsRepository.getAll();
    }

    public Student getById(Integer id){
        return this.studentsRepository.getById(id);
    }
}
