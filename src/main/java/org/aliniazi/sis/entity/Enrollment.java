package org.aliniazi.sis.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.aliniazi.sis.enums.EnrollmentStatus;
import org.hibernate.annotations.SQLRestriction;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(
        name = "sis_enrollment",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_enrollment_student_course", columnNames = {"student_id", "course_id"})
        },
        indexes = {
                @Index(name = "idx_enrollment_student_id", columnList = "student_id"),
                @Index(name = "idx_enrollment_course_id", columnList = "course_id"),
                @Index(name = "idx_enrollment_status", columnList = "status"),
                @Index(name = "idx_enrollment_staudent_status", columnList = "student_id,status")
        }
)
@SQLRestriction("data_state <> 100")
public class Enrollment extends BaseEntity {

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false, foreignKey = @ForeignKey(name = "fk_enrollment_student"))
    private Student student;


    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", nullable = false, foreignKey = @ForeignKey(name = "fk_enrollment_course"))
    private Course course;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private EnrollmentStatus status;

    @Column(name = "absence_count", nullable = false)
    private Short absenceCount;

    @Column(name = "grade", precision = 4, scale = 2)
    private BigDecimal grade;

    @Column(name = "graded_at")
    private Instant gradedAt;


}
