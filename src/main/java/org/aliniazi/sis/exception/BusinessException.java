package org.aliniazi.sis.exception;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

    private final String messageKey;
    private final Object[] messageArgs;

    public BusinessException(String messageKey, Throwable cause, Object... messageArgs) {
        super(cause);
        this.messageKey = messageKey;
        this.messageArgs = messageArgs;
    }

    public BusinessException(String messageKey) {
        this(messageKey, null, null);
    }

    public BusinessException(String messageKey, Object[] messageArgs) {
        this(messageKey, null, messageArgs);
    }

    public BusinessException(String messageKey, Throwable cause) {
        this(messageKey, cause , null);
    }


}
