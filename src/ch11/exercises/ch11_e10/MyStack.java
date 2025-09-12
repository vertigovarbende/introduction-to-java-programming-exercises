package ch11.exercises.ch11_e10;

import java.util.ArrayList;

public class MyStack extends ArrayList<String> {
	public void push(String item) {
		add(item);
	}

	public String pop() {
		if (!isEmpty()) {
			return remove(size() - 1);
		}
		return null;
	}

}
