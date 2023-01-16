package com.masters.coding.lesson;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/lessons")
public class LessonController {
    private final LessonService lessonService;

    @GetMapping
    public String getLessonsList() {
        return "lesson/list";
    }

}
