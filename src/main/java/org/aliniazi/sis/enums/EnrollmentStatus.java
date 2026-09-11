package org.aliniazi.sis.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnrollmentStatus {
    PENDING((byte) 0),
    ENROLLED((byte) 1),
    IN_PROGRESS((byte) 2),
    PASSED((byte) 3),
    FAILED((byte) 4),
    DROPPED((byte) 5),
    CANCELLED((byte) 6);

    final Byte code;
}
