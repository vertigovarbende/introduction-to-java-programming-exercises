package ch09.introduction;

public class CircleWithStaticMembers {

	double radius;

	static int numberOfObjects = 0;

	CircleWithStaticMembers() {
		radius = 1;
		numberOfObjects++;
	}

	CircleWithStaticMembers(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}

	static int getNumberOfObjects() {
		return numberOfObjects;
	}

	double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
}
