package org.aliniazi.sis.service.impl;

import lombok.AllArgsConstructor;
import org.aliniazi.sis.mapper.ProfessorMapper;
import org.aliniazi.sis.repository.ProfessorRepository;
import org.aliniazi.sis.service.ProfessorService;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProfessorServiceImpl implements ProfessorService {

    private final ProfessorRepository  professorRepository;
    private final ProfessorMapper professorMapper;

}
