package ch11.exercises.ch11_e02;

import java.util.Random;

public class RandomPerson {

	public Person createPerson() {
		Person per = null;
		Random rand = new Random();
		int randomNumber = rand.nextInt(4);
		switch(randomNumber) {
			case 0:
				per = new Employee("John", "blabal address", "123-123-12-12", "asd@gmail.com", "Finance", 3500.50);
				break;
			case 1:
				per = new Faculty("Alice", "aqweqweal address", "123-123-12-12", "asd@gmail.com", "IB", 2500.50, "08.00 - 17.00", "Junior");
				break;
			case 2: 
				per = new Staff("Alex", "123123address", "123-123-12-12", "qaqwed@gmail.com", "Maid", 1500.50, "head");
				break;
			case 3:
				per = new Student("Tommy", "ggqgqgqaddress", "123-123-12-12", "zxczxc@gmail.com", "Junior");
				break;
		}
		return per;
	}
}
