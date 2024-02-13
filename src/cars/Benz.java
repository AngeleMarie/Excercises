package cars;

public class Benz extends Car implements AirConditioner {
int minHeight=200;
int maxHeight=500;

public Benz(String color, int seats, int minHeight, int maxHeight) {
	super(color, seats, minHeight, maxHeight);

	}

	@Override
	public void watchTelevision() {
	System.out.println("Watching television");
		
	}

	@Override
	public void playRadio() {
		System.out.println("Listening radio");
		
	}

	@Override
	public void manageTemperature() {
		System.out.println("Managing Temperature");
		
	}

}
