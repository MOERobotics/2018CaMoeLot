package org.usfirst.frc.team365.robot;

public class RightScaleSwitch {
	
	public static final double INCHES = Robot.INCHES_TO_ENCTICKS;
	public static final double FEET = 12 * INCHES;
	
	public static void run(Robot us) {
		
		switch (us.autoStep) {
		
			case 1:
				us.autoPIDStraight(208.8 * INCHES, 0, 0.7);
				break;
				
			case 2:
				if (us.navX.getYaw() < -27) { //-30?
					us.driveRobot(0, 0);
					us.autoStep = 3;
				}
				else {
					us.driveRobot(0, 0.6); 
				}
				break;
				
			case 3:
				us.autoPIDStraight(27.24 * INCHES, -27, 0.6); //3500?
				us.autoTimer.reset();
				break;
				
			case 4:
				if (us.autoTimer.get() > 1) {
					us.autoStep = 5;
				}
				else
					us.driveRobot(0, 0);
				break;
			
			case 5:
				us.autoPIDTurn(-120);
				break;
				
			case 6:
				us.autoPIDStraight(16.32 * INCHES, -120, 0.6); //4800 to 5100
				break;
				
			case 7:
				us.autoPIDTurn(-180);
				us.autoTimer.reset();
				break;
				
			case 8:
				if (us.autoTimer.get() > 1) {
					us.autoStep = 9;
				}
				else {
					us.driveRobot(0, 0);
				}
				break;
				
			case 9:
				us.autoPIDStraight(21.84 * INCHES, -180, 0.5); //maybe change the 2400??
				break;
				
		
		}
	}


}
