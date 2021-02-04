package com.kpi.it01.kurkin.position;

public class PositionIsUnavaibleException extends Exception {
    public PositionIsUnavaibleException() {
    }

    public PositionIsUnavaibleException(String message) {
        super(message);
    }

    public PositionIsUnavaibleException(String message, Throwable cause) {
        super(message, cause);
    }

    public PositionIsUnavaibleException(Throwable cause) {
        super(cause);
    }

    public PositionIsUnavaibleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
