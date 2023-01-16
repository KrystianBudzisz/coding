package com.masters.coding.teacher.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@AllArgsConstructor //
@NoArgsConstructor //
@Getter // Gettery
@Setter // Settery
@Builder // Budowanie konstruktora bez pozostalych wartosci np tylko z id
public class Teacher {


    private int id;
    private String firstName;
    private String lastName;
//    @ManyToMany(mappedBy = "teachers")
//    private Set<Language> languages;


}
