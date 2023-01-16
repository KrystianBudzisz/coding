//package com.masters.coding.language.model;
//
//import com.masters.coding.teacher.model.Teacher;
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.util.Set;
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@Builder
//@Entity
//public class Language {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    @JoinTable(name = "teacher_language",
//            joinColumns = @JoinColumn(name = "language_id"),
//            inverseJoinColumns = @JoinColumn(name = "teacher_id"))
//    private Set<Teacher> teachers;
//    //getters, setters, constructors
//}
