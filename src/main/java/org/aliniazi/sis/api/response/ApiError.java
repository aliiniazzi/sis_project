package org.aliniazi.sis.api.response;

import java.time.Instant;

public record ApiError(
        String code ,
        String message ,
        String path ,
        Instant timestamp ,
        Object[] arguments
) {

    public static ApiError of(String code , String message , String path , Object... arguments) {
        return new ApiError(code, message, path, Instant.now(), arguments);
    }

    public static ApiError of(String code , String message , String path) {
        return new ApiError(code, message, path, Instant.now() , null);
    }

    public static ApiError of(String code , String message) {
        return new ApiError(code, message, null, Instant.now() , null);
    }

}
