package com.bestvike.linq.exception;

/**
 * @author 许崇雷
 * @date 2017/7/11
 */
public final class NotSupportedException extends RuntimeException {
    public NotSupportedException() {
        super("not supported.");
    }

    public NotSupportedException(String message) {
        super(message);
    }
}