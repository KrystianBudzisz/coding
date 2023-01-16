package com.masters.coding.lesson.model;

import com.masters.coding.student.model.Student;
import com.masters.coding.teacher.model.Teacher;
import lombok.*;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Lesson {
    private int id;
    private Student student;
    private Teacher teacher;
    private LocalDateTime dateTime;
}
