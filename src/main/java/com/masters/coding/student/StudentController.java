package com.masters.coding.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor // Automatycznie towrzy konstruktor
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public String getStudentList() {
        return "lesson/list";
    }

}
