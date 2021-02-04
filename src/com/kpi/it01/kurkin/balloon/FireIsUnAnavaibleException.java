package com.kpi.it01.kurkin.balloon;

public class FireIsUnAnavaibleException extends Exception {
    public FireIsUnAnavaibleException() {
    }

    public FireIsUnAnavaibleException(String message) {
        super(message);
    }

    public FireIsUnAnavaibleException(String message, Throwable cause) {
        super(message, cause);
    }

    public FireIsUnAnavaibleException(Throwable cause) {
        super(cause);
    }

    public FireIsUnAnavaibleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
