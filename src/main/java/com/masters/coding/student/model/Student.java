package com.masters.coding.student.model;

import com.masters.coding.language.model.Language;
import com.masters.coding.teacher.model.Teacher;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;
}
