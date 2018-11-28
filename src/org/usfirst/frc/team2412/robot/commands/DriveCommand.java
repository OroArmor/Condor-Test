package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.Robot;

public class DriveCommand extends CommandBase {
	public DriveCommand() {
		requires(drivebaseSubsystem);
	}
	
	public void execute() {
		drivebaseSubsystem.drive(Robot.m_oi.stick);
	}
}
