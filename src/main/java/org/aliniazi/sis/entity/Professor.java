package org.aliniazi.sis.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.aliniazi.sis.enums.AcademicRank;
import org.hibernate.annotations.SQLRestriction;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(
        name = "sis_professor",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_professor_code", columnNames = "code"),
                @UniqueConstraint(name = "uk_professor_national_code", columnNames = "national_code"),
                @UniqueConstraint(name = "uk_professor_username", columnNames = "username"),
                @UniqueConstraint(name = "uk_professor_email", columnNames = "email")
        }
)
@SQLRestriction("data_state <> 100")
public class Professor extends User {

    @Column(name = "code", nullable = false, updatable = false , length = 20)
    private String code;

    @Enumerated(EnumType.STRING)
    @Column(name = "academic_rank", nullable = false)
    private AcademicRank academicRank;

    @OneToMany(mappedBy = "professor", fetch = FetchType.EAGER)
    private List<Course> courses = new ArrayList<>();
}
