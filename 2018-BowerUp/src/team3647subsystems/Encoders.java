package team3647subsystems;

import edu.wpi.first.wpilibj.Encoder;
import team3647ConstantsAndFunctions.Constants;

public class Encoders 
{
	static Encoder leftEncoder = new Encoder(Constants.leftEncoderPinSourceA, Constants.leftEncoderPinSourceB, false, Encoder.EncodingType.k4X);
	static Encoder rightEncoder = new Encoder(Constants.rightEncoderPinSourceA, Constants.rightEncoderPinSourceB, false, Encoder.EncodingType.k4X);
	
	public double leftEncoderValue, rightEncoderValue;
	
	public void setEncoderValues()
	{
		leftEncoderValue = -Drivetrain.leftMotor.get();
		rightEncoderValue = Drivetrain.rightMotor.get();
	}
	
	public static void resetEncoders()
	{
		leftEncoder.reset();
		rightEncoder.reset();
	}
	
	public static void testEncoders()
	{
		System.out.println("Left Encoder Value: " + -leftEncoder.get());
		System.out.println("Right Encoder Value: " + rightEncoder.get());
	}

}
