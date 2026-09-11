package org.aliniazi.sis.service.impl;

import lombok.AllArgsConstructor;
import org.aliniazi.sis.mapper.CourseMapper;
import org.aliniazi.sis.repository.CourseRepository;
import org.aliniazi.sis.service.CourseService;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

}
