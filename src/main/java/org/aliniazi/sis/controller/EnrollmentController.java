package org.aliniazi.sis.controller;

import lombok.AllArgsConstructor;
import org.aliniazi.sis.service.EnrollmentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/enrollment")
public class EnrollmentController {

    private final EnrollmentService enrollmentService;

}
