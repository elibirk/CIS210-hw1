
import java.io.PrintWriter;

public class Car {
	
	private String make;
	private String color;
	private int MPG;
	
	public Car(){//default constructor
		make = "Ford";
		color = "Red";
		MPG = 30;
	}//end Car constructor
	
	public Car(String uMake){//default constructor
		make = uMake;
		color = "Red";
		MPG = 30;
	}//end Car make constructor
	
	public Car(String uMake, String uColor){//default constructor
		make = uMake;
		color = uColor;
		MPG = 30;
	}//end Car make, color constructor
	
	public Car(String uMake, String uColor, int uMPG){//default constructor
		make = uMake;
		color = uColor;
		if (uMPG >= 0){//MPG cannot be negative
			MPG = uMPG;
		}//end if
		else {
			System.out.println("MPG cannot be negative. Defaulting to 30.");
			MPG = 30;//MPG defaults to 30
		}
	}//end Car make, color, MPG constructor
	
	public void SetMake(String uMake){
		make = uMake;
	}//end SetMake
	
	public void SetColor(String uColor){
		color = uColor;
	}//end SetColor
	
	public void SetMPG(int uMPG){
		MPG = uMPG;
	}//end SetMPG
	
	public String GetMake(){
		return make;
	}//end GetMake
	
	public String GetColor(){
		return color;
	}//end GetColor
	
	public int GetMPG(){
		return MPG;
	}//end GetMPG
	
	public void DisplayCarInformation(){//display if there is no file
		System.out.println("Make: " + make + ", \tColor: " + color + ", \tMPG: " + MPG);//prints to screen
	}//end DisplayCarInformation
	
	public void DisplayCarInformation(PrintWriter output){//display if there is a file
		System.out.println("Make: " + make + "\tColor: " + color + "\tMPG: " + MPG);//prints to screen
		output.println("Make: " + make + "\tColor: " + color + "\tMPG: " + MPG);//prints to file
		
	}//end DisplayCarInformation

}//end class Car