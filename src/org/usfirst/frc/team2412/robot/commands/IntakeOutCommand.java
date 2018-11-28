package org.usfirst.frc.team2412.robot.commands;

public class IntakeOutCommand extends CommandBase {

	public IntakeOutCommand() {
		requires(intakeInOutSubsystem);
	}

	public void execute() {
		intakeInOutSubsystem.intakeOut();
	}

}
