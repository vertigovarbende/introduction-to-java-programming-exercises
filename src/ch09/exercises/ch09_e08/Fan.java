package ch09.exercises.ch09_e08;

public class Fan {

	// The private constants variables
	private final int SLOW = 1;
	private final int MEDIUM = 2;
	private final int FAST = 3;

	// The private instance variables
	private int speed;
	private boolean on;
	private double radius;
	private String color;

	// Constructors

	// No-arg/Default constructor
	// +Fan()
	public Fan() {
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}

	// Smart constructor
	// +Fan(speed: int, on: boolean, radius: double, color: String) - smart
	// constructor
	public Fan(int speed, boolean on, double radius, String color) {
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'speed'
	public int getSpeed() {
		return speed;
	}

	// Setter method for private instance variable 'speed'
	public void setSpeed(int speed) {
		if (speed == 1)
			this.speed = SLOW;
		else if (speed == 2)
			this.speed = MEDIUM;
		else if (speed == 3)
			this.speed = FAST;
		else
			System.out.println("Please select a number between 1, 2 and 3");
	}

	// Getter method for private instance variable 'on'
	public boolean isOn() {
		return on;
	}

	// Setter method for private instance variable 'on'
	public void setOn(boolean on) {
		this.on = on;
	}

	// Getter method for private instance variable 'radius'
	public double getRadius() {
		return radius;
	}

	// Setter method for private instance variable 'radius'
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Getter method for private instance variable 'color'
	public String getColor() {
		return color;
	}

	// Setter method for private instance variable 'color'
	public void setColor(String color) {
		this.color = color;
	}

	// +toString()
	@Override
	public String toString() {
		if (on)
			return "Fan is ON. Fan[speed=" + speed + ",color=" + color + ",radius=" + radius + "]";
		else
			return "Fan is OFF. Fan[color=" + color + ",radius=" + radius + "]";
	}
}