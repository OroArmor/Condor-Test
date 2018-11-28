package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakeInOutSubsystem extends Subsystem {

	private WPI_TalonSRX roller = RobotMap.roller;
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

	public void intakeIn() {
		roller.set(1);
	}

	public void intakeOut() {
		roller.set(-1);
	}

	public void intakeStop() {
		roller.set(0);
	}
}
