package com.masters.coding.teacher;


import com.masters.coding.language.model.Language;
import com.masters.coding.teacher.model.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/teachers") //wszystkie metody w kontrolerze będą odpowiadały na żądania pod adresem URL zaczynającym się od "/teachers".
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping
    public String getTeachersList(Model model) {
        model.addAttribute("teachers", teacherService.findAll());
        return "teacher/list";
    }





}
