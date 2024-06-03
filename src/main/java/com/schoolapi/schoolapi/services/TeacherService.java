
package com.schoolapi.schoolapi.services;

import com.schoolapi.schoolapi.repositories.ITeacherRepository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolapi.schoolapi.models.Teacher;;

@Service
public class TeacherService implements ITeacherService {

    @Autowired
    private ITeacherRepository repository;

    public List<Teacher> getAll(){
        return repository.getAll().stream().map(t -> {
            Teacher aux = (Teacher) t.clone();
            aux.setCode("");
            return aux;
        }).collect(Collectors.toList());
    }

    public Teacher getById(Integer id){
        return repository.getById(id);
    }
}
