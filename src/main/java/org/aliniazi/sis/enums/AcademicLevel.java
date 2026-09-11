package org.aliniazi.sis.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AcademicLevel {
    ASSOCIATE((byte) 0), BACHELOR((byte) 1), MASTER((byte) 2), PHD((byte) 3), POSTDOC((byte) 4);

    final Byte code;
}
