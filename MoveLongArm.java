import rxtxrobot.*;

public class MoveLongArm {
	public static void main(String[] args) {	
		
		// Startup
		RXTXRobot r = new ArduinoNano(); //Create RXTXRobot object
		r.setPort("/dev/tty.usbmodem14201"); // Set the port
		// r.setVerbose(true); //Turn on debugging messages
		r.connect();
		
		// Raise arm
		r.runPCATimedServo(13, 10, 3000);
		
		// Lower arm
		r.runPCATimedServo(13, 70, 3000);
		//r.runPCATimedServo(13, 70, 3000); 
		
		r.runPCATimedServo(13, 10, 3000);
		
		// End program
		r.close();
		
	} //end main
	
}// end BoxTest