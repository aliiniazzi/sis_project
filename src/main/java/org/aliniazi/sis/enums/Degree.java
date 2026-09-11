package org.aliniazi.sis.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Degree {
    DIPLOMA((byte) 0),
    ASSOCIATE((byte) 1),
    BACHELOR((byte) 2),
    MASTER((byte) 3),
    DOCTORATE((byte) 4);

    final Byte code;
}
