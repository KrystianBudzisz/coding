package com.masters.coding.student;

import com.masters.coding.student.model.Student;
import com.masters.coding.teacher.model.Teacher;
import jakarta.annotation.PostConstruct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository  {
    private static final List<Student> dummyStudentDb = new ArrayList<>();

    public List<Student> findAll() {
        return dummyStudentDb;
    }
    @PostConstruct
    private static void init() {
        Student student1 = Student.builder()
                .id(1L)
                .firstName("Andrzej")
                .lastName("Duda")
                .build();
        Student student2 = Student.builder()
                .id(2L)
                .firstName("Wiki")
                .lastName("Bednarek")
                .build();
        dummyStudentDb.add(student1);
        dummyStudentDb.add(student2);
    }

}
