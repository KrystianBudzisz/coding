package com.masters.coding.teacher;

import com.masters.coding.language.LanguageRepository;
import com.masters.coding.language.model.Language;
import com.masters.coding.student.model.Student;
import com.masters.coding.teacher.model.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor // Automatycznie towrzy konstruktor
public class TeacherService{

    private final TeacherRepository teacherRepository;

public List<Teacher> findAll() {
    return teacherRepository.findAll();
}
}



