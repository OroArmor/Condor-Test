package org.usfirst.frc.team2412.robot.commands;

public class IntakeDownCommand extends CommandBase {

	public IntakeDownCommand() {
		// TODO Auto-generated constructor stub

		requires(intakeUpDownSubsystem);
	}

	public void execute() {
		intakeUpDownSubsystem.intakeDown();
	}

	public boolean isFinished() {
		return true;
	}
}
