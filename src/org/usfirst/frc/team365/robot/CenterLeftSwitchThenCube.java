package org.usfirst.frc.team365.robot;

// Original author: Audrey

public class CenterLeftSwitchThenCube
{
	
	public static final double INCHES = Robot.INCHES_TO_ENCTICKS;
	public static final double FEET = 12 * INCHES;
	
	static void run(Robot us) {
	
		
		switch(us.autoStep) {
		
		case 1:
			if (us.navX.getYaw() < -49) {
				us.driveRobot(0, 0);
				us.autoStep = 2;
			}
			else 
				us.driveRobot(0, 0.6);
			break;
			
		case 2:
			AutoSimplify.goStraight(us, 7.45 * FEET, -52.0, 0.6);
			break;
			
		case 3:	
			if (us.navX.getYaw() >= -3) {
				us.driveRobot(0, 0);
				us.resetEncoders();
				us.autoStep = 4;
			}
			else 
				us.driveRobot(0.6, 0);
			break;
			
		case 4: 
			AutoSimplify.goStraight(us, 1.5 * FEET, 0, 0.6);
			us.autoTimer.reset();
			break;
			
		case 5:
			if (us.autoTimer.get() > 1.0) {
				us.autoTimer.reset();
				us.autoStep = 6;
			}
			else {
				us.driveRobot(0, 0);
			}
			break;
			
		case 6:
			AutoSimplify.goStraight(us, 4 * FEET, 0, -0.6);
			break;
			
		case 7: 
			AutoSimplify.turnToAngle(us, 90, 0.6);
			break;
			
		case 8:
			AutoSimplify.goStraight(us, 4.5 * FEET, 90, 0.6);
			break;
		
		case 9:
			AutoSimplify.turnToAngle(us, 0, 0.6);
			break;
			
		case 10:
			AutoSimplify.goStraight(us, 1.2 * FEET, 0, 0.6);
			break;

		
		
		}
		
	}
	
}
