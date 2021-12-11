package by.bsuir.web.oop.dao;

import java.io.Serial;

public class ApplianceDaoException extends Exception {

    @Serial
    private static final long serialVersionUID = -182932558565756926L;

    public ApplianceDaoException() {
    }

    public ApplianceDaoException(String message) {
        super(message);
    }

    public ApplianceDaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplianceDaoException(Throwable cause) {
        super(cause);
    }
}
