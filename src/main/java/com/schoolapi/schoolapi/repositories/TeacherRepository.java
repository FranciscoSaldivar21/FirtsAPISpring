package com.schoolapi.schoolapi.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

import com.schoolapi.schoolapi.models.Teacher;

@RequestScope
@Repository
public class TeacherRepository implements ITeacherRepository {
    private List<Teacher> teachers;

    public TeacherRepository(){
        this.teachers = Arrays.asList(
            new Teacher(1, "Raul", "21548978", "raul@gmail.com"),
            new Teacher(2, "Ana", "8748978", "ana@gmail.com"),
            new Teacher(3, "Esmeralda", "105478969", "esmeralda@gmail.com"),
            new Teacher(4, "Ernesto", "2187441478", "ernesto@gmail.com"),
            new Teacher(5, "Oscar", "2178969847", "oscar@gmail.com"),
            new Teacher(6, "Fernando", "789698547", "fernando@gmail.com")
        );
    }

    public List<Teacher> getAll(){
        return this.teachers;
    }

    public Teacher getById(Integer id){
        return this.teachers.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }
}
