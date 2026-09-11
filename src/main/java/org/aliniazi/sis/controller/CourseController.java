package org.aliniazi.sis.controller;

import lombok.AllArgsConstructor;
import org.aliniazi.sis.service.CourseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/course")
public class CourseController {

    private final CourseService courseService;

}
