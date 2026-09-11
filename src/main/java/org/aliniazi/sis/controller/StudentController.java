package org.aliniazi.sis.controller;

import lombok.AllArgsConstructor;
import org.aliniazi.sis.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    private final StudentService studentService;

}
