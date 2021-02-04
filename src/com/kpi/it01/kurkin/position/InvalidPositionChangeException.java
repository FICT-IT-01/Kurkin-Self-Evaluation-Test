package com.kpi.it01.kurkin.position;

public class InvalidPositionChangeException extends Exception {
    public InvalidPositionChangeException() {
    }

    public InvalidPositionChangeException(String message) {
        super(message);
    }

    public InvalidPositionChangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPositionChangeException(Throwable cause) {
        super(cause);
    }

    public InvalidPositionChangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
