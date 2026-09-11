package org.aliniazi.sis.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Semester {
    FALL((byte) 0),
    SPRING((byte) 1),
    SUMMER((byte) 2);

    final Byte code;
}
