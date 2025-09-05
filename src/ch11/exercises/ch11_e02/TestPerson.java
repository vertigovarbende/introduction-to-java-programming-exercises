package ch11.exercises.ch11_e02;

public class TestPerson {

	public static void main(String[] args) {
		
		RandomPerson randPerson = new RandomPerson();
		Person per = randPerson.createPerson();
		System.out.println(per);
	}
	
	
}
