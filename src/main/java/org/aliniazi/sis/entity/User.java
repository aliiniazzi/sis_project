package org.aliniazi.sis.entity;


import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.aliniazi.sis.enums.Degree;
import org.aliniazi.sis.enums.Gender;

import java.time.LocalDate;

@Getter
@Setter
@MappedSuperclass
public abstract class User extends BaseEntity {

    @Column(name = "first_name", nullable = false, length = 150)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 150)
    private String lastName;

    // todo {we need to unique this column in each table}
    @Column(name = "national_code", nullable = false, length = 10)
    private String nationalCode;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false, updatable = false)
    private Gender gender;

    @Column(name = "birth_day", nullable = false, updatable = false)
    private LocalDate birthDate;

    // todo {we need to unique this column in each table}
    @Column(name = "username", nullable = false, length = 100)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "last_degree")
    private Degree lastDegree;

    // todo {we need to unique this column in each table}
    @Column(name = "email")
    private String email;

}
