//Moves each servo individually. While this method should be used to move one servo individually, it is recommended to use moveBothServos if both servos must be moved simultaneously
import java.util.Scanner;

import rxtxrobot.*;

public class MoveServo
{
	public static void main(String[] args)
	{
		RXTXRobot r = new ArduinoNano(); // Create RXTXRobot object
		r.setPort("/dev/tty.usbmodem14201"); // Set the port to COM3
		r.setVerbose(false); // Turn on debugging messages
		r.connect();
		
		//starting position
		r.runPCAServo(12, 0);
		
		int input = 0;
		Scanner sc = new Scanner(System.in);
		
		while(input != -1) {
			
			System.out.print("Enter an angle: ");
			input = sc.nextInt();
			
			if(input < 0 || input > 180) {
				break;
			}//end if
			
			else {
				//Move 180 Servo on channel 12 to position "90 degrees"
				r.runPCAServo(12, input);
			}//end else
			
		}//end while
		
		//return to original position when you put in -1 
		r.runPCAServo(12, 0);
		
		r.close();
		
	}//end main
	
}//end MoveServo

