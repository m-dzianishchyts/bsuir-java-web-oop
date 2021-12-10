package by.bsuir.web.oop.service;

import java.io.Serial;

public class ApplianceServiceException extends Exception {

    @Serial
    private static final long serialVersionUID = 4533290456369436693L;

    public ApplianceServiceException() {
    }

    public ApplianceServiceException(String message) {
        super(message);
    }

    public ApplianceServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplianceServiceException(Throwable cause) {
        super(cause);
    }
}
