package org.aliniazi.sis.api.response;

import java.util.List;

public record ApiPageResponse<T>(
        List<T> content ,
        Integer page ,
        Integer size ,
        Long totalElements ,
        Integer totalPages
) {

    public static <T> ApiPageResponse<T> of(List<T> content, Integer page, Integer size, Long totalElements, Integer totalPages
    ) {
        return new ApiPageResponse<>(content, page, size, totalElements, totalPages);
    }

    public  static <T> ApiPageResponse<T> list(List<T> content, Long totalElements) {
        return new ApiPageResponse<>(content ,null , null ,  totalElements , null);
    }

}
