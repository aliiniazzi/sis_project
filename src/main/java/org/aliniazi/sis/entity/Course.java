package org.aliniazi.sis.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.aliniazi.sis.enums.Semester;
import org.hibernate.annotations.SQLRestriction;


@Getter
@Setter
@Entity
@Table(
        name = "sis_course",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_course_code", columnNames = "code")
        },
        indexes = {
                @Index(name = "idx_course_professor_id", columnList = "professor_id"),
                @Index(name = "idx_course_semester", columnList = "semester")
        }
)
@SQLRestriction("data_state <> 100")
public class Course extends BaseEntity {

    @Column(name = "code", nullable = false, updatable = false , length = 15)
    private String code;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "unit", nullable = false)
    private Byte unit;

    @Column(name = "capacity", nullable = false)
    private Short capacity;

    @Enumerated(EnumType.STRING)
    @Column(name = "semester", nullable = false)
    private Semester semester;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "professor_id", nullable = false, foreignKey = @ForeignKey(name = "fk_course_professor"))
    private Professor professor;
}
