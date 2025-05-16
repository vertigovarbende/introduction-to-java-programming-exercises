package ch08.exercises;

import java.util.Scanner;

public class CH08_E21_v1 {

	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the number of cities: ");
		int n = INPUT.nextInt();
		double[][] cities = new double[n][2];
		initializeCities(cities);
		findCentralCity(cities);

	}

	public static void findCentralCity(double[][] cities) {
		double[] allDistances = findAllDistances(cities);
		double centralCityTotalDistance = allDistances[0];
		int centralCityIndex = 0;
		for (int i = 0; i < allDistances.length; ++i)
			if (centralCityTotalDistance > allDistances[i]) {
				centralCityTotalDistance = allDistances[i];
				centralCityIndex = i;
			}
		double[] centralCity = cities[centralCityIndex];
		System.out.println("The central city is at (" + centralCity[0] + ", " + centralCity[1] + ")");
		System.out.printf("The total distance to all other cities is %.2f", allDistances[centralCityIndex]);
	}

	public static double[] findAllDistances(double[][] cities) {
		double[] allDistances = new double[cities.length];
		for (int i = 0; i < cities.length; ++i) {
			for (int j = 0; j < cities.length; ++j)
				allDistances[i] += distance(cities[i], cities[j]);
		}
		return allDistances;
	}

	public static double distance(double[] city1, double[] city2) {
		// return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2) + pow(z2 - z1, 2));
		return Math.sqrt((city2[0] - city1[0]) * (city2[0] - city1[0]) + (city2[1] - city1[1]) * (city2[1] - city1[1]));
	}

//	public static double distance(double x1, double y1, double x2, double y2) {
//		// return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2) + pow(z2 - z1, 2));
//		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
//	}

	public static void initializeCities(double[][] cities) {
		System.out.println("Enter the coordinates of the cities");
		for (int i = 0; i < cities.length; ++i)
			for (int j = 0; j < cities[i].length; ++j) {
				System.out.print("[" + i + "][" + j + "]: ");
				cities[i][j] = INPUT.nextDouble();
			}
	}
}
