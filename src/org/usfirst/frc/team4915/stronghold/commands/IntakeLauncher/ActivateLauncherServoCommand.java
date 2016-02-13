package org.usfirst.frc.team4915.stronghold.commands.IntakeLauncher;
import org.usfirst.frc.team4915.stronghold.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ActivateLauncherServoCommand extends Command {

    public ActivateLauncherServoCommand() {

    }

    protected void initialize() {
        Robot.intakeLauncher.activateLaunchServo();
    }

    protected void execute() {
        SmartDashboard.putNumber("Servo Position", Robot.intakeLauncher.getLauncherServo().get());
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {

    }

    protected void interrupted() {
    
    }
}