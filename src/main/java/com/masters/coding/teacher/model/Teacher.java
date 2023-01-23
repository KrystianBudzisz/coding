package com.masters.coding.teacher.model;


import com.masters.coding.language.model.Language;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor //
@NoArgsConstructor //
@Getter
@Setter
@Builder //Budowanie konstruktora bez pozostalych wartosci np tylko z id
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "teacher_language", joinColumns = @JoinColumn(name = "teacher_id"), inverseJoinColumns = @JoinColumn(name = "language_id"))
    private List<Language> languages;
}
