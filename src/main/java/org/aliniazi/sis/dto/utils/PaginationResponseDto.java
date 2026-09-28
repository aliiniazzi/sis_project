package org.aliniazi.sis.dto.utils;

import java.util.List;

public record PaginationResponseDto<T>(
        List<T> data ,
        Long size
) {
}
