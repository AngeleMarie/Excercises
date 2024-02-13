package cars;

public class Toyota extends Car {

	public Toyota(String color, int seats, int minHeight, int maxHeight) {
		super(color, seats, minHeight, maxHeight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void watchTelevision() {
		System.out.println("Watching television");
		
	}

	@Override
	public void playRadio() {
		System.out.println("Listening to radio");
		
	}

}
