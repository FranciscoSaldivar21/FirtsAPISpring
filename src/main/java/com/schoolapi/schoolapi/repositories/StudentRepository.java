package com.schoolapi.schoolapi.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

import com.schoolapi.schoolapi.models.Student;

@RequestScope
@Repository
public class StudentRepository implements IStudentRepository {
    private List<Student> students;

    public StudentRepository(){
        this.students = Arrays.asList(
            new Student(1, "Raul", "21548978", "raul@gmail.com"),
            new Student(2, "Ana", "8748978", "ana@gmail.com"),
            new Student(3, "Esmeralda", "105478969", "esmeralda@gmail.com"),
            new Student(4, "Ernesto", "2187441478", "ernesto@gmail.com"),
            new Student(5, "Oscar", "2178969847", "oscar@gmail.com"),
            new Student(6, "Fernando", "789698547", "fernando@gmail.com")
        );
    }

    public List<Student> getAll(){
        return this.students;
    }

    public Student getById(Integer id){
        return this.students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }
}
