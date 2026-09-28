package org.aliniazi.sis.service.impl;

import lombok.AllArgsConstructor;
import org.aliniazi.sis.dto.course.CourseRequestDto;
import org.aliniazi.sis.dto.course.CourseResponseDto;
import org.aliniazi.sis.dto.utils.PaginationResponseDto;
import org.aliniazi.sis.entity.Course;
import org.aliniazi.sis.exception.BusinessException;
import org.aliniazi.sis.mapper.CourseMapper;
import org.aliniazi.sis.repository.CourseRepository;
import org.aliniazi.sis.service.CourseService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@AllArgsConstructor
@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repository;
    private final CourseMapper mapper;

    @Override
    public CourseResponseDto add(CourseRequestDto requestDto) {

        // CHECK EXIST
        repository.findByCode(requestDto.code()).ifPresent(course -> {
            throw new BusinessException("course.already.exist");
        });

        return mapper.toDto(repository.save(mapper.toEntity(requestDto)));
    }

    @Override
    public List<CourseResponseDto> addAll(List<CourseRequestDto> requestDtos) {
        return List.of();
    }

    @Override
    public List<CourseResponseDto> importCourses(MultipartFile file) {
        return List.of();
    }

    @Override
    public MultipartFile exportCourses(CourseRequestDto request) {
        return null;
    }

    @Override
    public CourseResponseDto update(CourseRequestDto requestDto) {
        return null;
    }

    @Override
    public List<CourseResponseDto> updateAll(List<CourseRequestDto> requestDtos) {
        return List.of();
    }

    @Override
    public CourseResponseDto delete(Long courseId) {
        return null;
    }

    @Override
    public CourseResponseDto findById(Long courseId) {
        return null;
    }

    @Override
    public PaginationResponseDto<CourseResponseDto> findAll(CourseRequestDto requestDto) {
        return null;
    }

    @Override
    public PaginationResponseDto<CourseResponseDto> findAllBySemester(CourseRequestDto requestDto) {
        return null;
    }

    @Override
    public PaginationResponseDto<CourseResponseDto> search(CourseRequestDto requestDto) {
        return null;
    }

    @Override
    public CourseResponseDto changeStatus(CourseRequestDto requestDto) {
        return null;
    }

    @Override
    public List<CourseResponseDto> changeStatusAll(List<CourseRequestDto> requestDto) {
        return List.of();
    }

    private Course getById(Long courseId) {
        return repository.findById(courseId).orElseThrow(() -> new BusinessException("course.not.found"));
    }





}
