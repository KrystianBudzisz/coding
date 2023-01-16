package com.masters.coding.teacher;

import com.masters.coding.teacher.model.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/teachers") //wszystkie metody w kontrolerze będą odpowiadały na żądania pod adresem URL zaczynającym się od "/teachers".
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping
    public String getTeachersList() {
        return "teacher/list";
    }

    public ResponseEntity<List<Teacher>> getAllTeachers() {
        try {
            List<Teacher> teachers = teacherService.findAll();
            return new ResponseEntity<>(teachers, HttpStatus.OK); //ResponseEntity -  to klasa z Spring Framework, która reprezentuje odpowiedź HTTP zwracaną przez metodę kontrolera.
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }




}
