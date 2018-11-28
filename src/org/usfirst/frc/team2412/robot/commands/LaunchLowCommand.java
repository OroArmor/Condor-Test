package org.usfirst.frc.team2412.robot.commands;

public class LaunchLowCommand extends CommandBase{

	public LaunchLowCommand() {
		requires(catapultSubsystem);
	}
	
	public void execute() {
		catapultSubsystem.launchLow();
	}
	
	public void end() {
		catapultSubsystem.retractLow();
	}

	public boolean isFinished() {
		return true;
	}
}
