import rxtxrobot.*;

public class MoveShortArm {
	public static void main(String[] args) {	
		
		// Startup
		RXTXRobot r = new ArduinoNano(); //Create RXTXRobot object
		r.setPort("/dev/tty.usbmodem14201"); // Set the port
		// r.setVerbose(true); //Turn on debugging messages
		r.connect();
		
		// Raise arm
		r.runPCATimedServo(14, 10, 3000); 
		
		// Lower arm
		//r.runPCATimedServo(14, 120, 3000); 
		
		// End program
		r.close();
		
	} //end main
	
}// end BoxTest