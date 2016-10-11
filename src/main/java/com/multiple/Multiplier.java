package com.multiple;

public class Multiplier {

	public static void main(String[] args) {
		Multiplier  multiplier = new Multiplier();
		multiplier.execute();
	}

	private void execute() {
		for (int index = 1; index <= 100; index++) {
			if (index % 3 == 0 && index % 5 == 0) {
				System.out.println("Zillow");
			} else if (index % 3 == 0) {
				System.out.println("Zil");
			} else if (index % 5 == 0) {
				System.out.println("low");
			} else {
				System.out.printf("%d\n", index);
			}
		}
	}
	
}
