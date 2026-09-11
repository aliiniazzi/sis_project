package org.aliniazi.sis.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.aliniazi.sis.enums.AcademicLevel;
import org.hibernate.annotations.SQLRestriction;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(
        name = "sis_student",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_student_std_number", columnNames = "std_number"),
                @UniqueConstraint(name = "uk_student_national_code", columnNames = "national_code"),
                @UniqueConstraint(name = "uk_student_username", columnNames = "username"),
                @UniqueConstraint(name = "uk_student_email", columnNames = "email")
        }
)
@SQLRestriction("data_state <> 100")
public class Student extends User {

    @Column(name = "std_number", nullable = false, updatable = false, length = 20)
    private String stdNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "academic_level", updatable = false, nullable = false)
    private AcademicLevel academicLevel;


    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Enrollment> enrollments = new ArrayList<>();

}
