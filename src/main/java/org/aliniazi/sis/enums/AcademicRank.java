package org.aliniazi.sis.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AcademicRank {
    ASSISTANT_PROFESSOR((byte) 0), ASSOCIATE_PROFESSOR((byte) 1), PROFESSOR((byte) 2);

    final Byte code;
}
