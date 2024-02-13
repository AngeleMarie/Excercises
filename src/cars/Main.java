package cars;
import java.io.*;

public class Main {
	static String filename = "car.ser";
	public static void main(String[] args) {
		Car myCar=new Car("yellow",103,200,100);
		System.out.println("\nCar");
		System.out.println("---------------------------");
		System.out.println("Car Color: "+myCar.getColor());
		System.out.println("Seats: "+myCar.getSeats());
		System.out.println("Maximum Height: "+myCar.getMaxHeight());
		System.out.println("Minimum Height: "+myCar.getMinHeight());	
	         

	try (FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
		
			){

		out.writeObject(myCar);
	out.close();
	file.close();
	System.out.println("Object has been serialized");
	
	
	}
	catch (IOException ex) {
	System.out.println("IOException is caught");
	}

	}
	}
