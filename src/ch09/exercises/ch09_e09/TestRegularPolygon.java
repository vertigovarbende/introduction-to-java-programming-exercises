package ch09.exercises.ch09_e09;

public class TestRegularPolygon {

	public static void main(String[] args) {
		RegularPolygon rpObj1 = new RegularPolygon();
		RegularPolygon rpObj2 = new RegularPolygon(6, 4);
		RegularPolygon rpObj3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		// the perimeter and the area of the rpObj1
		System.out.println("rpObj1");
		System.out.println(rpObj1.getPerimeter());
		System.out.println(rpObj1.getArea());

		// the perimeter and the area of the rpObj2
		System.out.println("rpObj2");
		System.out.println(rpObj2.getPerimeter());
		System.out.println(rpObj2.getArea());
		
		// the perimeter and the area of the rpObj3
		System.out.println("rpObj3");
		System.out.println(rpObj3.getPerimeter());
		System.out.println(rpObj3.getArea());
	}
}
