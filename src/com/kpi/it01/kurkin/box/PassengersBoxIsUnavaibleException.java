package com.kpi.it01.kurkin.box;

public class PassengersBoxIsUnavaibleException extends Exception {
    public PassengersBoxIsUnavaibleException() {
    }

    public PassengersBoxIsUnavaibleException(String message) {
        super(message);
    }

    public PassengersBoxIsUnavaibleException(String message, Throwable cause) {
        super(message, cause);
    }

    public PassengersBoxIsUnavaibleException(Throwable cause) {
        super(cause);
    }

    public PassengersBoxIsUnavaibleException(String message, Throwable cause, boolean enableSuppression,
                                             boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
