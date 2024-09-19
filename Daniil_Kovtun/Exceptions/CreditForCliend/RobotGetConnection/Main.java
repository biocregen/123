package Exceptions.CreditForCliend.RobotGetConnection;

public class Main {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY)  {
        RobotConnection a = null;
        try {
            a = robotConnectionManager.getConnection();
            a.moveRobotTo(toX, toY);
        } catch (RobotConnectionException b){
            try {
                a = robotConnectionManager.getConnection();
                a.moveRobotTo(toX, toY);
            } catch (RobotConnectionException c) {
                try {
                    a = robotConnectionManager.getConnection();
                    a.moveRobotTo(toX, toY);
                } catch (RobotConnectionException d) {
                    throw d;
                }
            }
        } finally {
            try {
                if (a != null) {
                    a.close();
                }
            } catch (Throwable e) {}
        }
    }
}
