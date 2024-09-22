package Exceptions.CreditForCliend.RobotGetConnection;

public class Main {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY)  {
        RobotConnection a = null;
        for (int i = 0; i < 3; i++) {
            try {
                a = robotConnectionManager.getConnection();
                a.moveRobotTo(toX, toY);
                break;
            } catch (RobotConnectionException b) {
                if (i == 2) {
                    throw new RobotConnectionException("Connection Exception");
                }
            } finally {
                try {
                    if (a != null) {
                        a.close();
                    }
                } catch (Throwable e) {
                }
            }
        }
    }
}
