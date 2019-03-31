// This example shows how to move the DC motors.

import rxtxrobot.*;

public class RunMotor
{
	public static void main(String[] args)
	{
		RXTXRobot r = new ArduinoNano(); // Create RXTXRobot object
		r.setPort("/dev/tty.usbmodem14201"); // Set port to COM3
		r.connect();

		//Runs a motor on channel 2 at speed 100 and a motor on channel 3 at speed -200 for 5000 milliseconds
		r.runTwoPCAMotor(8, -60, 9, 480, 6500);	//9500 is 3 meters
					//right motor	 //left motor

		r.close();
	}
}
