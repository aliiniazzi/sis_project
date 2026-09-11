package org.aliniazi.sis.mapper;

import org.aliniazi.sis.dto.professor.ProfessorRequestDto;
import org.aliniazi.sis.dto.professor.ProfessorResponseDto;
import org.aliniazi.sis.entity.Professor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfessorMapper {

    Professor toEntity(ProfessorRequestDto professorRequestDto);

    ProfessorResponseDto toDto(Professor professor);

}
