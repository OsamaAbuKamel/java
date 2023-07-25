package TestTwo;

public class Motorcycle extends Vehicle {
	private int motoId;

	public Motorcycle() {
		super();
	}

	public Motorcycle(int motoId) {
		super();
		this.motoId = motoId;
	}

	public int getMotoId() {
		return motoId;
	}

	public void setMotoId(int motoId) {
		this.motoId = motoId;
	}

	@Override
	public void convert() {
		System.out.println("Motocycle converted");

	}

	@Override
	public void start() {
		System.out.println("Motocycle Started");
	}
}