package ch09.exercises.ch09_e11;

public class LinearEquation {

	// The private instance variable
	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int f;

	// Constructor

	// Smart constructor
	// +LinearEquation(a: int, b: int, c: int, d: int, e: int, f: int)
	public LinearEquation(int a, int b, int c, int d, int e, int f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	// +isSolvable(): boolean
	// this method true if 'ad - bc' is not 0
	public boolean isSolvable() {
		int result = (a * d) - (b * c);
		if (result != 0)
			return true;
		return false;
	}

	private double getSolvable() {
		return (a * d) - (b * c);
	}

	// +getX(): double
	public double getX() {
		if (isSolvable())
			return ((e * d) - (b * f)) / getSolvable();
		return 0;
	}

	// +getY(): double
	public double getY() {
		if (isSolvable())
			return ((a * f) - (e * c)) / getSolvable();
		return 0;
	}
}
