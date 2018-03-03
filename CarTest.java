package Lab1_perry_leah;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CarTest {
	/*PROGRAM: CarTest / Lab1
	 * AUTHOR: Leah Perry
	 * Due Date: November 17, 2015
	 * SUMMARY: Simulates Car class
	 */
	public static void main(String[]args) throws IOException, FileNotFoundException{
		PrintWriter outputfile = new PrintWriter("carInfo.txt");//creates output file
		ArrayList <Car> cars = new ArrayList<Car>();//initialize empty array
		
		cars.add(new Car());//adds default car
		cars.add(new Car("Toyota"));//creates car with nrand
		cars.add(new Car("KIA", "Blue"));//creates car with brand and color
		cars.add(new Car("Chevy", "Green", 92));//creates car with brand, color, and mpg
		
		for(int i = 0; i < cars.size(); i++){
			cars.get(i).DisplayCarInformation(outputfile);//displays info about each car
		}//end for
		outputfile.close();
	}//end main
}//end car test
