package com.pfproject.api.exception.model;

public class AccessDenied extends RuntimeException {

    private static final long serialVersionUID = -8658131859161427602L;

    public AccessDenied() {
        super();
    }

    public AccessDenied(final String message) {
        super(message);

    }

    public AccessDenied(final String message, final Throwable cause) {
        super(message, cause);

    }

}
