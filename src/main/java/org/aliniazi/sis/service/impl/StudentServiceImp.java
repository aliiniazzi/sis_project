package org.aliniazi.sis.service.impl;

import lombok.AllArgsConstructor;
import org.aliniazi.sis.mapper.StudentMapper;
import org.aliniazi.sis.repository.StudentRepository;
import org.aliniazi.sis.service.StudentService;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class StudentServiceImp implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

}
