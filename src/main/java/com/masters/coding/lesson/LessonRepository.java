package com.masters.coding.lesson;

import com.masters.coding.lesson.model.Lesson;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LessonRepository {
    private static final List<Lesson> dummyLessonDb = new ArrayList<>();
    public List<Lesson> findAll() {
        return dummyLessonDb;
    }

    @PostConstruct
    private static void init() {
        Lesson lesson1 = Lesson.builder()
                .id(1L).build();
        dummyLessonDb.add(lesson1);
    }
}
