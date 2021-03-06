package org.usfirst.frc.team4915.stronghold.commands.IntakeLauncher.Boulder;

import org.usfirst.frc.team4915.stronghold.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LaunchBallForAutoCommand extends Command {

    public LaunchBallForAutoCommand() {
        requires(Robot.intakeLauncher);
        setTimeout(2);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        System.out.println("Auto launch command");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.intakeLauncher.setSpeedLaunchHigh();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.intakeLauncher.activateLauncherServos();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
