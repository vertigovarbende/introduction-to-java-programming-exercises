package ch04.exercises.CH04_E02_v1;

import static java.lang.Math.*;
import java.util.Scanner;

public class CH04_E02_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Point[] points = { new Point(), new Point() };
		enterTheValues(points, scan);
		System.out.format("The distance between the two points is %.5f km ", calDistance(points));

		System.out.println();
		System.out.println(points[0].getEn() + " " + points[0].getEn());
		System.out.println(points[1].getEn() + " " + points[1].getEn());

	}

	public static void enterTheValues(Point[] points, Scanner scan) {
		for (int i = 0; i < points.length; ++i) {
			for (int j = 0; j < points.length; ++j)
				if (i == 0) {
					System.out.print("point[" + (j + 1) + "] enlemini giriniz: ");
					points[j].setEn(scan.nextDouble());
				} else if (i == 1) {
					System.out.print("point[" + (j + 1) + "] boylamını giriniz: ");
					points[j].setBoy(scan.nextDouble());
				}
		}
	}

	public static double calDistance(Point[] points) {
		double r = 6_371.01;
		double hesap = (sin(toRadians(points[0].getEn())) * sin(toRadians(points[1].getEn())))
				+ cos(toRadians(points[0].getEn())) * cos(toRadians(points[1].getEn()))
						* cos(toRadians(points[0].getBoy() - points[1].getBoy()));
		return r * acos(toRadians(hesap));
	}

}
