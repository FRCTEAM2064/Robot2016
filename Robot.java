package org.usfirst.frc.team2064.robot;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team2064.robot.subsystems.Actuator;
import org.usfirst.frc.team2064.robot.subsystems.DriveTrain; 
import org.usfirst.frc.team2064.robot.subsystems.ForkArm;
import org.usfirst.frc.team2064.robot.subsystems.Winch;
import org.usfirst.frc.team2064.robot.subsystems.Infeed;
import org.usfirst.frc.team2064.robot.commands.DriveWithJoysticks;
import org.usfirst.frc.team2064.robot.commands.ActuatorIn;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static final DriveTrain driveTrain = new DriveTrain();
	public static final Actuator actuator = new Actuator();
	public static final ForkArm forkArm = new ForkArm();
	public static final Winch winch = new Winch();
	public static final Infeed infeed = new Infeed();
	public static OI oi;
	public static int atLevel = 0;
	public static boolean isMotorStopped;
	//public AnalogGyro gyro = new AnalogGyro(RobotMap.Gyro);
	

    Command autonomousCommand;
    
   // public void getGyro(){
    	//gyro.reset();
    	//System.out.print(gyro.getAngle());
    	
    //}

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
        // instantiate the command used for the autonomous period
        //autonomousCommand = new ExampleCommand();
    
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
		log();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
      
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        log();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	//gyro.reset();
        Scheduler.getInstance().run();
        log();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
        log();
    }

  private void log(){
    	//LiveWindow.addSensor("gyro", "gyro", gyro);
    	//gyro.reset(); 
	  LiveWindow.addSensor("encoder", "encValue", forkArm.enc);
  	  SmartDashboard.putNumber("Encoder Value ", forkArm.encoder().getDistance());
    	
    	//SmartDashboard.putNumber("GYRO Value ", gyro.getAngle()*1000);
    }
}
