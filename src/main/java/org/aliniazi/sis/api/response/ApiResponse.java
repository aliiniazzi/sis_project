package org.aliniazi.sis.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.Instant;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record ApiResponse<T>(
        Boolean success ,
        T data ,
        ApiError error ,
        Instant timestamp
) {

    public static <T> ApiResponse<T> ok(T data) {
        return new ApiResponse<>(true , data , null , Instant.now());
    }

    public static <T> ApiResponse<T> ok() {
        return new ApiResponse<>(true , null , null , Instant.now());
    }

    public static <T> ApiResponse<T> error(ApiError error) {
        return new ApiResponse<>(false , null , error , Instant.now());
    }
}
