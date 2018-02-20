package org.usfirst.frc.team365.robot;

public class CenterRightSwitchAutonomous3 {
	public static final double INCHES = Robot.INCHES_TO_ENCTICKS;
	public static final double FEET = 12 * INCHES;
	
	static void run(Robot robot) {
		switch (robot.autoStep) {
		case 1:
			if(robot.navX.getYaw() > 42) {
				robot.distanceL.reset();
				robot.distanceR.reset();
				robot.autoStep = 2;
			}
			else {
				robot.autoStep = 2;
			}
			break;
		case 2:
			robot.turnToAngle(0);
			break;
		case 3:
			robot.driveRobot(0.1, 0.6);
			robot.autoStep = 4;
			break;
		case 4:
			break;
		}
	}
}
