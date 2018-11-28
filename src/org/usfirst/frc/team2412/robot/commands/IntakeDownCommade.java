package org.usfirst.frc.team2412.robot.commands;

public class IntakeDownCommade extends CommandBase {

	public IntakeDownCommade() {
		requires(intakeUpDownSubsystem);
	}
	
	public void execute() {
		intakeUpDownSubsystem.intakeDown();
	}
	
	public boolean isFinished() {
		return true;
	}

}
