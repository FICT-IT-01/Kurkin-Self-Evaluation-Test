package com.kpi.it01.kurkin.box;

public class TooMuchPassengersException extends Exception {
    public TooMuchPassengersException() {
    }

    public TooMuchPassengersException(String message) {
        super(message);
    }

    public TooMuchPassengersException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooMuchPassengersException(Throwable cause) {
        super(cause);
    }

    public TooMuchPassengersException(String message, Throwable cause, boolean enableSuppression,
                                      boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
