package org.usfirst.frc.team2412.robot.commands;

public class IntakeUpCommand extends CommandBase {

	public IntakeUpCommand() {
		// TODO Auto-generated constructor stub
		requires(intakeUpDownSubsystem);
	}
	
	public void execute() {
		intakeUpDownSubsystem.intakeUp();
	}
	
	public boolean isFinished() {
		return true;
	}
	
	

}
