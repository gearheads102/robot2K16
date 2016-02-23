package org.usfirst.frc.team102.robot.commands;

import org.usfirst.frc.team102.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class StopBall extends Command {
	
	public StopBall() {
		requires(Robot.robotHoop);
	}
	
	protected void initialize() {
		Robot.robotHoop.stopTalon();
	}

	protected void execute() {
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {
	}

	protected void interrupted() {
	}
}