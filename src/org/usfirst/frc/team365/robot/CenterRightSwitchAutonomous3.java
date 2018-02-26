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
				robot.driveRobot(.7, 0);
			}
			break;
		case 2:
			robot.goStraight(45.0 * INCHES, 45, .5);
			break;
		case 3:
			if(robot.navX.getYaw() < 3) {
				robot.distanceL.reset();
				robot.distanceR.reset();
				robot.autoStep = 4;
			}
			else {robot.driveRobot(0,.6);
			
			}
			break;
		case 4:
			robot.goStraight(14 * INCHES,0,.7);
			break;
		case 5:
			robot.driveRobot(0,0);
		}
	}
}
