package org.aliniazi.sis.service.impl;

import lombok.AllArgsConstructor;
import org.aliniazi.sis.mapper.EnrollmentMapper;
import org.aliniazi.sis.repository.EnrollmentRepository;
import org.aliniazi.sis.service.EnrollmentService;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;
    private final EnrollmentMapper enrollmentMapper;

}
