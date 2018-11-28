/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2412.robot;

import com.ctre.phoenix.motorcontrol.can.*;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;

	public static int rollerID = 4;
	public static WPI_TalonSRX roller = new WPI_TalonSRX(rollerID);

	public static int[] drivebaseIDs = new int[] { 0, 1, 2, 3 };
	public static WPI_TalonSRX[] drivebases = new WPI_TalonSRX[] {
			new WPI_TalonSRX(drivebaseIDs[0]),
			new WPI_TalonSRX(drivebaseIDs[1]),
			new WPI_TalonSRX(drivebaseIDs[2]),
			new WPI_TalonSRX(drivebaseIDs[3])
	};
	
	public static int catapultID1 = 0;
	public static int catapultID2 = 1;
	
	public static DoubleSolenoid catapult = new DoubleSolenoid(catapultID1, catapultID2);
	
	
	public static int latchID1 = 2;
	public static int latchID2 = 3;
	
	public static DoubleSolenoid latch = new DoubleSolenoid(latchID1, latchID2);

	
	public static int up = 4;
	public static int down = 5;
	
	public static DoubleSolenoid upDown = new DoubleSolenoid(up, down);

	public static SpeedControllerGroup leftSide = new SpeedControllerGroup(drivebases[0], drivebases[1]);
	public static SpeedControllerGroup rightSide = new SpeedControllerGroup(drivebases[2], drivebases[3]);
	
	public static DifferentialDrive drive = new DifferentialDrive(leftSide, rightSide);
	
	
}