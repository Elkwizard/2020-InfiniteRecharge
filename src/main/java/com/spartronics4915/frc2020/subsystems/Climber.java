/**
 * This subsystem has two motors. A NEO using a Spark, while the other is a 775 PRO using a Talon.
 * The NEO motor winches the climber and the 775 PRO extends the climber
 * The four methods used are extend(), winch(), reverse(), and stop()
 */

package com.spartronics4915.frc2020.subsystems;

import com.spartronics4915.frc2020.Constants;
import com.spartronics4915.lib.subsystems.SpartronicsSubsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.TalonSRXFeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Climber extends SpartronicsSubsystem {

    private static TalonSRX mClimber775Pro;
    private static CANSparkMax mClimberNEO;

    public Climber() {
        // Hardware Contructor (Add motors and such here when I get them)
        mClimber775Pro = new TalonSRX(Constants.Climber.kLiftMotorId);
        mClimberNEO = new CANSparkMax(Constants.Climber.kWinchMotorId, MotorType.kBrushless);
    }

    public static void extend() {
        mClimber775Pro.set(ControlMode.PercentOutput, 0.0);
        mClimberNEO.set(0.0);
    }

    public static void winch() {
        mClimber775Pro.set(ControlMode.PercentOutput, 0.0);
        mClimberNEO.set(0.0);
    }

    public static void reverse() {
        mClimber775Pro.set(ControlMode.PercentOutput, 0.0);
        mClimberNEO.set(0.0);
    }

    public static void stop() {
        mClimber775Pro.set(ControlMode.PercentOutput, 0.0);
        mClimberNEO.set(0.0);
    }

}
