package org.usfirst.frc.team365.robot;

public class EXAMPLE_AUTO_ROUTINE {
	public static final double INCHES = Robot.INCHES_TO_ENCTICKS;
	public static final double FEET = 12 * INCHES;

	static void run(Robot robot) {
		switch (robot.autoStep) {
		case 1:
			/**
			    LIST OF AUTO COMMANDS:
				
				robot.goStraight(Ticks to Move, navX setPoint, Set Power);
					This goes straight.
					
				robot.turnToAngle(navx setPoint);
					This turns at using a maxPower of 0.6.
					
				robot.turnToAngle(navx setPoint, maxPower);
					This turns to the setpoint using your maxPower.
					
				robot.halfTurnLeft(angle, power);
					This turns the robot to the left using only half of the drivetrain to your angle at your power.
					
				robot.halfTurnRight(angle, power);
					This turns the robot to the right using only half of the drivetrain to your angle at your power.
					
				robot.pause(seconds);
					This waits for the number of seconds you provided then moves onto the next auto step.
					
				robot.autoPIDTurn(navx setPoint);
					This turns to your setpoint using an alternate pid loop. The power will always be 0.6.
					
				robot.goStraightSS(Ticks to Move, navX setPoint, maxPower);
					This goes straight just like goStraight but will rampup and rampdown the robot speed.
					
					*/
			
			// Add Autonomous code here
			break;
		case 2:
			// Add Autonomous code here
			break;

		}
	}
}
