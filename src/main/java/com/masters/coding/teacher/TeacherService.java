package com.masters.coding.teacher;

import com.masters.coding.teacher.model.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor // Automatycznie towrzy konstruktor
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }
}
