package TestTwo;

public abstract class Vehicle implements Convertible {
	private String name;
	private String color;

	public Vehicle() {
		super();
	}

	public Vehicle(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void stop() {
		System.out.println("Vehicle Stopped");
	}

	public abstract void start();

}