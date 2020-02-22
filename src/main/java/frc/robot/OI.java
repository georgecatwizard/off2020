// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

//yeet


package frc.robot;

import frc.robot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Button;
import frc.robot.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
public Joystick stick0;
public Joystick stick1;
public Button button1;
public Button button2;
public Button button3;
public Button button4;
public Button button5;
public Button button6;



public XboxController xbox;
//public XboxController xbox;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

stick1 = new Joystick(1);

stick0 = new Joystick(0);
xbox = new XboxController(2);

button1 = new JoystickButton(xbox, 1); //a
button2 = new JoystickButton(xbox, 2); //b
button3 = new JoystickButton(xbox, 3); // x
button4 = new JoystickButton(xbox, 4); //y
button5 = new JoystickButton(xbox, 5); //ltrigger

button1.whileHeld(new DumbRollerCommand(0.3));
button2.whileHeld(new ClimberRaiseCmd());
button3.whileHeld(new DumbArmRaiseCommand(0.25));
button4.whileHeld(new ClimberLiftRobotCmd());
button5.whileHeld(new DumbRollerCommand(-0.2));






        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("DriveCmd", new DriveCmd());
        SmartDashboard.putData("ClimberLiftRobotCmd", new ClimberLiftRobotCmd());
        SmartDashboard.putData("ClimberRaiseCmd", new ClimberRaiseCmd());
        SmartDashboard.putData("IntakeMode", new IntakeMode());
        //SmartDashboard.putData("PositionArmPID", new PositionArmPID());
        SmartDashboard.putData("ClearBalls", new ClearBalls());
        SmartDashboard.putData("PID Rotate  90", new RotatePID(90));

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
public Joystick getStick0() {
        return stick0;
    }

public Joystick getStick1() {
        return stick1;
    }

public Button getButton1()
{
    return button1;
}

public Button getButton2()
{
    return button2;
}

public Button getButton3()
{
    return button3;
}

public Button getButton4()
{
    return button4;
}


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

