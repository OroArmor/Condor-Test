package org.usfirst.frc.team2412.robot.commands;

public class DriveCommand extends CommandBase {
	public DriveCommand() {
		requires(drivebaseSubsystem);
	}
	
	public void execute() {
		drivebaseSubsystem.drive();
	}
}
