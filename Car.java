package Lab1_perry_leah;

import java.io.PrintWriter;

public class Car {
	
	private String brand;
	private String color;
	private int MPG;
	
	public Car(){//default constructor
		brand = "Ford";
		color = "Red";
		MPG = 30;
	}//end Car constructor
	
	public Car(String uBrand){//default constructor
		brand = uBrand;
		color = "Red";
		MPG = 30;
	}//end Car brand constructor
	
	public Car(String uBrand, String uColor){//default constructor
		brand = uBrand;
		color = uColor;
		MPG = 30;
	}//end Car brand, color constructor
	
	public Car(String uBrand, String uColor, int uMPG){//default constructor
		brand = uBrand;
		color = uColor;
		if (uMPG >= 0){//MPG cannot be negative
			MPG = uMPG;
		}//end if
		else {
			System.out.println("MPG cannot be negative. Defaulting to 30.");
			MPG = 30;//MPG defaults to 30
		}
	}//end Car brand, color, MPG constructor
	
	public void SetBrand(String uBrand){
		brand = uBrand;
	}//end SetBrand
	
	public void SetColor(String uColor){
		color = uColor;
	}//end SetColor
	
	public void SetMPG(int uMPG){
		MPG = uMPG;
	}//end SetMPG
	
	public String GetBrand(){
		return brand;
	}//end GetBrand
	
	public String GetColor(){
		return color;
	}//end GetColor
	
	public int GetMPG(){
		return MPG;
	}//end GetMPG
	
	public void DisplayCarInformation(){//display if there is no file
		System.out.println("Brand: " + brand + ", \tColor: " + color + ", \tMPG: " + MPG);//prints to screen
	}//end DisplayCarInformation
	
	public void DisplayCarInformation(PrintWriter output){//display if there is a file
		System.out.println("Brand: " + brand + "\tColor: " + color + "\tMPG: " + MPG);//prints to screen
		output.println("Brand: " + brand + "\tColor: " + color + "\tMPG: " + MPG);//prints to file
		
	}//end DisplayCarInformation

}//end class Car
