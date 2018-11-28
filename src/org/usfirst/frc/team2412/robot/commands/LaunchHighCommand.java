package org.usfirst.frc.team2412.robot.commands;

public class LaunchHighCommand extends CommandBase {

	public LaunchHighCommand() {
		requires(catapultSubsystem);
	}
	
	public void execute() {
		catapultSubsystem.launchHigh();
	}
	
	public void end() {
		catapultSubsystem.retractHigh();
	}
	public boolean isFinished() {
		return true;
	}

}
