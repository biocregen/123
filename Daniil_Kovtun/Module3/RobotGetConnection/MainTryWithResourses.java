package Module3.RobotGetConnection;

public class MainTryWithResourses {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 0; i < 3; i++) {
            try (RobotConnection a = robotConnectionManager.getConnection()) {
                a.moveRobotTo(toX, toY);
                break;
            } catch (RobotConnectionException b) {
                if (i == 2) {
                    throw new RobotConnectionException("Connection Exception");
                }
            }
        }
    }
}
