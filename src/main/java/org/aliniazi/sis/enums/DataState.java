package org.aliniazi.sis.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DataState {
    ACTIVE((byte) 0),
    INACTIVE((byte) 1),
    ARCHIVED((byte) 2),
    DELETED((byte) 3);

    final Byte code;
}
