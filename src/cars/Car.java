
package cars;
import java.io.*;
public  class Car implements RadioTv,Serializable{
	private static final long serialVersionUID = 7363132668437302432L;
String color;
public static int seats;
public int minHeight;
public int maxHeight;
public Car(String color,int seats,int minHeight,int maxHeight) {
	this.color=color;
	this.seats=seats;
	this.minHeight=minHeight;
	this.maxHeight=maxHeight;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public static int getSeats() {
	try {
		if(seats>100) {
			throw new SetNumberException("the number of seats is beyond 100");
		}
		}
	catch(SetNumberException e) {
		System.out.println("the error is: "+e);
	}
	return seats;

}
public static void setSeats(int seats) {
	Car.seats = seats;
}
public int getMinHeight() {
	return minHeight;
}
public void setMinHeight(int minHeight) {
	this.minHeight = minHeight;
}
public int getMaxHeight() {
	return maxHeight;
}
public void setMaxHeight(int maxHeight) {
	this.maxHeight = maxHeight;
}
public static void checking() {
		}
@Override
public void watchTelevision() {
	// TODO Auto-generated method stub
	
}
@Override
public void playRadio() {
	// TODO Auto-generated method stub
	
}

}
