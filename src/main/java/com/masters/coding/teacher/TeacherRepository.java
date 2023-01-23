package com.masters.coding.teacher;

import com.masters.coding.teacher.model.Teacher;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //adnotacja do usunięcia w momencie zmiany repository na interface
public class TeacherRepository {

    private static final List<Teacher> dummyTeacherDb = new ArrayList<>();

    public List<Teacher> findAll() {
        return dummyTeacherDb;
    }

    @PostConstruct
    private static void init() {
        Teacher teacher1 = Teacher.builder()
                .id(1L)
                .firstName("Jan")
                .lastName("Kowalski")
                .build();
        Teacher teacher2 = Teacher.builder()
                .id(2L)
                .firstName("Janusz")
                .lastName("Kowal")
                .build();
        dummyTeacherDb.add(teacher1);
        dummyTeacherDb.add(teacher2);
    }


}

