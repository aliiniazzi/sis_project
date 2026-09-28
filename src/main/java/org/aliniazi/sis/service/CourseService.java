package org.aliniazi.sis.service;

import org.aliniazi.sis.dto.course.CourseRequestDto;
import org.aliniazi.sis.dto.course.CourseResponseDto;
import org.aliniazi.sis.dto.utils.PaginationResponseDto;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

public interface CourseService {

    CourseResponseDto add(CourseRequestDto requestDto);

    List<CourseResponseDto> addAll(List<CourseRequestDto> requestDtos);

    List<CourseResponseDto> importCourses(MultipartFile file);

    // by seme
    MultipartFile exportCourses(CourseRequestDto request);

    CourseResponseDto update(CourseRequestDto requestDto);

    List<CourseResponseDto> updateAll(List<CourseRequestDto> requestDtos);

    CourseResponseDto delete(Long courseId);

    // cache [update cache after update !]
    CourseResponseDto findById(Long courseId);

    // pagination + sort
    PaginationResponseDto<CourseResponseDto> findAll(CourseRequestDto requestDto);

    // pagination + sort + cache
    PaginationResponseDto<CourseResponseDto> findAllBySemester(CourseRequestDto requestDto);

    // pagination + sort
    PaginationResponseDto<CourseResponseDto> search(CourseRequestDto requestDto);

    // todo [get capacity + professor] + schedule for after semester

    CourseResponseDto changeStatus(CourseRequestDto requestDto);


    List<CourseResponseDto> changeStatusAll(List<CourseRequestDto> requestDto);



}
