package ch09.introduction;

public class TestCircleWithPrivateDataFields {

	public static void main(String[] args) {
		
		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
		System.out.println("The are of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
		
		// increase myCircle's radius by 10%
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The are of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
		
		System.out.println("The number of objects created is " + CircleWithPrivateDataFields.getNumberOfObjects());
	}
}
