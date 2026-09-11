package org.aliniazi.sis.mapper;

import org.aliniazi.sis.dto.course.CourseRequestDto;
import org.aliniazi.sis.dto.course.CourseResponseDto;
import org.aliniazi.sis.entity.Course;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    Course toEntity(CourseRequestDto courseRequestDto);

    CourseResponseDto toDto(Course course);

}
