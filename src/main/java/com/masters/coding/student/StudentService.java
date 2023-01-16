package com.masters.coding.student;

import com.masters.coding.student.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor // Automatycznie towrzy konstruktor
public class StudentService {
    private final  StudentRepository studentRepository;
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
