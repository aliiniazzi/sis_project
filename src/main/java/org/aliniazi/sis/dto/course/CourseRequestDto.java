package org.aliniazi.sis.dto.course;

import org.aliniazi.sis.enums.Semester;

public record CourseRequestDto(
        String code ,
        String title ,
        Byte unit ,
        Short capacity ,
        Semester semester

) {
}
