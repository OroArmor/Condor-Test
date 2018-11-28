package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.*;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command {
	DriveBaseSubsystem drivebaseSubsystem = new DriveBaseSubsystem();	
	IntakeInOutSubsystem intakeInOutSubsystem = new IntakeInOutSubsystem();
	IntakeUpDownSubsystem intakeUpDownSubsystem = new IntakeUpDownSubsystem();
	CatapultSubsystem catapultSubsystem = new CatapultSubsystem();
	
	
	protected boolean isFinished() {
		return false;
	}
}
