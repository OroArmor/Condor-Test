package org.usfirst.frc.team2412.robot.commands;

public class IntakeInCommand extends CommandBase {

	public IntakeInCommand() {
		requires(intakeInOutSubsystem);
	}

	public void execute() {
		intakeInOutSubsystem.intakeIn();
	}

}
