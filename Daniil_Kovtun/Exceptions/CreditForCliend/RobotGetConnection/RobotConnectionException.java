package Exceptions.CreditForCliend.RobotGetConnection;

public class RobotConnectionException extends RuntimeException{
    public RobotConnectionException(String message) {
        super(message);

    }

    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
