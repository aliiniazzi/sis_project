package org.aliniazi.sis.mapper;

import org.aliniazi.sis.dto.student.StudentRequestDto;
import org.aliniazi.sis.dto.student.StudentResponseDto;
import org.aliniazi.sis.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    Student toEntity(StudentRequestDto studentRequestDto);

    StudentResponseDto toDto(Student student);

}
