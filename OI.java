package org.usfirst.frc.team2064.robot;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

//import org.usfirst.frc.team2064.robot.commands.MoveMotor;
import org.usfirst.frc.team2064.robot.commands.ActuatorIn;
import org.usfirst.frc.team2064.robot.commands.ActuatorOut;
import org.usfirst.frc.team2064.robot.commands.ForkArmUp;
import org.usfirst.frc.team2064.robot.commands.ForkArmDown;
import org.usfirst.frc.team2064.robot.commands.WinchExtend;
import org.usfirst.frc.team2064.robot.commands.WinchRetract;
import org.usfirst.frc.team2064.robot.commands.ForkArmHome;
import org.usfirst.frc.team2064.robot.commands.ForkArmClimbHeight;
import org.usfirst.frc.team2064.robot.commands.ForkArmTeleMax;
import org.usfirst.frc.team2064.robot.commands.FeedIn;
import org.usfirst.frc.team2064.robot.commands.FeedOut;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  
	public Joystick driveLeftJoy = new Joystick(RobotMap.driveLeftJoy);
	public Joystick driveRightJoy = new Joystick(RobotMap.driveRightJoy);
	public Joystick operatorJoy = new Joystick(RobotMap.operatorJoy);
	
	//public Button SampleMotors= new JoystickButton(operatorJoy, RobotMap.SampleMotors);
	public Button ActuatorIn= new JoystickButton(operatorJoy, RobotMap.ActuatorIn);
	public Button ActuatorOut= new JoystickButton(operatorJoy, RobotMap.ActuatorOut);
	public Button ForkArmUp = new JoystickButton(operatorJoy, RobotMap.ForkArmUp);
	public Button ForkArmDown = new JoystickButton(operatorJoy, RobotMap.ForkArmDown);
	public Button WinchExtend = new JoystickButton(operatorJoy,RobotMap.WinchExtend);
	public Button WinchRetract = new JoystickButton(operatorJoy, RobotMap.WinchRetract);
	public Button FeedIn = new JoystickButton(operatorJoy, RobotMap.FeedIn);
	public Button FeedOut = new JoystickButton(operatorJoy, RobotMap.FeedOut);
	public Button ForkArmHome = new JoystickButton(operatorJoy, RobotMap.ForkArmHome);
	public Button ForkArmTeleMax = new JoystickButton(operatorJoy, RobotMap.ForkArmTeleMax);
	public Button ForkArmClimbHeight = new JoystickButton(operatorJoy, RobotMap.ForkArmClimbHeight);
	
	//public Gyro gyro = new Gyro(0);
	
	
	
	public OI(){
		//SampleMotors.whenPressed(new MoveMotor());
		ActuatorIn.whenPressed(new ActuatorIn());
		ActuatorOut.whenPressed(new ActuatorOut());
		ForkArmUp.whileHeld(new ForkArmUp());
		ForkArmDown.whileHeld(new ForkArmDown());
		WinchExtend.whileHeld(new WinchExtend());
		WinchRetract.whileHeld(new WinchRetract());
		FeedIn.whileHeld(new FeedIn());
		FeedOut.whileHeld(new FeedOut());
		ForkArmHome.whenPressed(new ForkArmHome());
		ForkArmTeleMax.whenPressed(new ForkArmTeleMax());
		ForkArmClimbHeight.whenPressed(new ForkArmClimbHeight());
	}
	
	public Joystick getLeftJoystick() {
		return driveLeftJoy;
	}

	public Joystick getRightJoystick() {
		return driveRightJoy;
	}

}

