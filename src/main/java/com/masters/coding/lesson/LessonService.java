package com.masters.coding.lesson;

import com.masters.coding.lesson.model.Lesson;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LessonService {
    private final LessonRepository lessonRepository;
    public List<Lesson> findAll() {
        return lessonRepository.findAll();
    }

}
