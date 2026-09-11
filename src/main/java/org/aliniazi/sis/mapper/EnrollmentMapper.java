package org.aliniazi.sis.mapper;

import org.aliniazi.sis.dto.enrollment.EnrollmentRequestDto;
import org.aliniazi.sis.dto.enrollment.EnrollmentResponseDto;
import org.aliniazi.sis.entity.Enrollment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnrollmentMapper {

    Enrollment toEntity(EnrollmentRequestDto enrollmentRequestDto);

    EnrollmentResponseDto toDto(Enrollment enrollment);

}
