package ch08.introduction;

import java.util.Scanner;

public class Weather {

	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {

		// data[i][j][k]
		// data[i] --> which day
		// data[i][j] --> which hour
		// data[i][j][0] --> temperature
		// data[i][j][1] --> humidity

		final int NUMBER_OF_DAYS = 10;
		final int NUMBER_OF_HOURS = 24;
		double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

		read(data);
		average(data);

	}

	// read input using input redirection from a file
	public static void read(double[][][] data) {
		for (int i = 0; i < data.length * data[i].length; ++i) {
			int day = INPUT.nextInt();
			int hour = INPUT.nextInt();
			double temperature = INPUT.nextDouble();
			double humidity = INPUT.nextDouble();
			data[day - 1][hour - 1][0] = temperature;
			data[day - 1][hour - 1][1] = humidity;
		}
	}

	// find the average daily temperature and humidty
	public static void average(double[][][] data) {
		for (int i = 0; i < data.length; ++i) {
			double dailyTemperatureTotal = 0, dailyHumidityTotal = 0;
			for (int j = 0; j < data[i].length; ++j) {
				dailyTemperatureTotal += data[i][j][0];
				dailyHumidityTotal += data[i][j][1];
			}
			System.out.println("Day " + i + "'s average temperature is " + (dailyTemperatureTotal / data[i].length));
			System.out.println("Day " + i + "'s average humidity is " + (dailyHumidityTotal / data[i].length));
		}
	}
}