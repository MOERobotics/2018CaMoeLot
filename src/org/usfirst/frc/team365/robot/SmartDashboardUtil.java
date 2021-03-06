package org.usfirst.frc.team365.robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class SmartDashboardUtil {

	private static Timer smartDashboardTimer = new Timer() {{
		start();
	}};

	public static void dashboardInit(Robot ourselves) {
		setDefaultValues(ourselves);
		printToSmartDashboard(ourselves);
		getFromSmartDashboard(ourselves);
	}

	public static void dashboardPeriodic(Robot ourselves) {

		if (smartDashboardTimer.hasPeriodPassed(0.1)) {
			printToSmartDashboard(ourselves);
			getFromSmartDashboard(ourselves);
			smartDashboardTimer.reset();
			smartDashboardTimer.start();
		}

	}

	static void setDefaultValues(Robot ourselves) {
		SmartDashboard.putNumber("straightP", ourselves.straightP);
		SmartDashboard.putNumber("straightI", ourselves.straightI);
		SmartDashboard.putNumber("straightD", ourselves.straightD);
		SmartDashboard.putNumber(    "turnP", ourselves.turnP    );
		SmartDashboard.putNumber(    "turnI", ourselves.turnI    );
		SmartDashboard.putNumber(    "turnD", ourselves.turnD    );
	}

	static void getFromSmartDashboard(Robot ourselves) {
		ourselves.straightP = SmartDashboard.getNumber("straightP", ourselves.straightP);
		ourselves.straightI = SmartDashboard.getNumber("straightI", ourselves.straightI);
		ourselves.straightD = SmartDashboard.getNumber("straightD", ourselves.straightD);
		ourselves.turnP     = SmartDashboard.getNumber(    "turnP", ourselves.turnP    );
		ourselves.turnI     = SmartDashboard.getNumber(    "turnI", ourselves.turnI    );
		ourselves.turnD     = SmartDashboard.getNumber(    "turnD", ourselves.turnD    );
	}

	static void printToSmartDashboard(Robot ourselves) {
		SmartDashboard.putString(           "status", ourselves.statusMessage                 );
		//parts
		SmartDashboard.putNumber(        "distRight", ourselves.distanceR.getRaw()            );
		SmartDashboard.putNumber(         "distLeft", ourselves.distanceL.getRaw()            );
		SmartDashboard.putNumber(  "driveOutputLeft", ourselves.driveOutputLeft               );
		SmartDashboard.putNumber( "driveOutputRight", ourselves.driveOutputRight              );

		//navx
		SmartDashboard.putNumber(              "Yaw", ourselves.navX.getYaw()                 );
//		SmartDashboard.putNumber(    "accelerationX", ourselves.navX.getWorldLinearAccelX()   );
//		SmartDashboard.putNumber(    "accelerationY", ourselves.navX.getWorldLinearAccelY()   );

		//sensors
		SmartDashboard.putNumber(     "sonarVoltage", ourselves.readSonar.getAverageVoltage() );

		//auto
		SmartDashboard.putNumber(      "autoRoutine", ourselves.autoRoutine                   );
		SmartDashboard.putNumber(         "autoStep", ourselves.autoStep                      );
		SmartDashboard.putNumber(        "AutoTimer", ourselves.autoTimer.get()               );
	}
}
