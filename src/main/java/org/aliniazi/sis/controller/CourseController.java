package org.aliniazi.sis.controller;

import lombok.AllArgsConstructor;
import org.aliniazi.sis.api.response.ApiResponse;
import org.aliniazi.sis.dto.course.CourseRequestDto;
import org.aliniazi.sis.dto.course.CourseResponseDto;
import org.aliniazi.sis.service.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/course/")
public class CourseController {

    private final CourseService service;

    @PostMapping("add")
    public ResponseEntity<ApiResponse<CourseResponseDto>> add(@RequestBody CourseRequestDto courseRequestDto){
        return ResponseEntity.ok(ApiResponse.ok(service.add(courseRequestDto)));
    }

}
