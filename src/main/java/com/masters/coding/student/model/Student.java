package com.masters.coding.student.model;

import com.masters.coding.teacher.model.Teacher;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String language;

}
