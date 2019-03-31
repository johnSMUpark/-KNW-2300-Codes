import rxtxrobot.*;
import java.io.PrintStream;
import java.util.Scanner;

public class GateTest{
	public static void main(String[] args)
	{		
		//Startup
		RXTXRobot r = new ArduinoNano(); //Create RXTXRobot object
		r.setPort("/dev/tty.usbmodem14201"); // Set the port
		//r.setVerbose(true); //Turn on debugging messages
		r.connect();
		
		
		//CLOSE GATE (PORT 15)
		r.runPCAServo(15, 10);

		//OPEN GATE (PORT 15)
		//r.runPCAServo(15, 175);
		
		
		//End program
		r.close();
	}
}
