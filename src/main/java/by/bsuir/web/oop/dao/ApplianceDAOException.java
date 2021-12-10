package by.bsuir.web.oop.dao;

import java.io.Serial;

public class ApplianceDAOException extends Exception {

    @Serial
    private static final long serialVersionUID = -182932558565756926L;

    public ApplianceDAOException() {
    }

    public ApplianceDAOException(String message) {
        super(message);
    }

    public ApplianceDAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplianceDAOException(Throwable cause) {
        super(cause);
    }
}
