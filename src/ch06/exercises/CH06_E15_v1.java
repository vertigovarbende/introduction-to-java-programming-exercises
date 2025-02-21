package ch06.exercises;

public class CH06_E15_v1 {

	public static void main(String[] args) {
		displayTable();
	}

	public static double computeTax(int status, double taxableIncome) {
		double tax = 0.0;

		if (status == 0) {
			if (taxableIncome <= 8_350)
				tax = taxableIncome * 0.10;
			else if (taxableIncome <= 33_950)
				tax = 8_350 * 0.10 + (taxableIncome - 8_350) * 0.15;
			else if (taxableIncome <= 82_250)
				tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (taxableIncome - 33_950) * 0.25;
			else if (taxableIncome <= 171_550)
				tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (82_250 - 33_950) * 0.25 + (taxableIncome - 82_250) * 0.28;
			else if (taxableIncome <= 372_950)
				tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (82_250 - 33_950) * 0.25 + (171_550 - 82_250) * 0.28
						+ (taxableIncome - 171_550) * 0.33;
			else
				tax = 8_350 * 0.10 + (33_950 - 8_350) * 0.15 + (82_250 - 33_950) * 0.25 + (171_550 - 82_250) * 0.28
						+ (372_950 - 171_550) * 0.33 + (taxableIncome - 372_950) * 0.35;
		} else if (status == 1) {
			if (taxableIncome <= 16700)
				tax = taxableIncome * 0.10;
			else if (taxableIncome <= 67900)
				tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
			else if (taxableIncome <= 137050)
				tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15 + (taxableIncome - 67900) * 0.25;
			else if (taxableIncome <= 208850)
				tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15 + (taxableIncome - 67900) * 0.25
						+ (taxableIncome - 137050) * 0.28;
			else if (taxableIncome <= 372950)
				tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15 + (taxableIncome - 67900) * 0.25
						+ (taxableIncome - 137050) * 0.28 + (taxableIncome - 208850) * 0.33;
			else
				tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15 + (taxableIncome - 67900) * 0.25
						+ (taxableIncome - 137050) * 0.28 + (taxableIncome - 208850) * 0.33
						+ (taxableIncome - 372950) * 0.35;
		} else if (status == 2) {
			if (taxableIncome <= 8350)
				tax = taxableIncome * 0.10;
			else if (taxableIncome <= 33950)
				tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
			else if (taxableIncome <= 68525)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
			else if (taxableIncome <= 104425)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (taxableIncome - 68525) * 0.28;
			else if (taxableIncome <= 186475)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
						+ (taxableIncome - 104425) * 0.33;
			else
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
						+ (186475 - 104425) * 0.33 + (taxableIncome - 186475) * 0.35;
		} else if (status == 3) {
			if (taxableIncome <= 11_950)
				tax = taxableIncome * 0.10;
			else if (taxableIncome <= 45_500)
				tax = 11_959 * 0.10 + (taxableIncome - 11_950) * 0.15;
			else if (taxableIncome <= 117_450)
				tax = 11_959 * 0.10 + (taxableIncome - 11_950) * 0.15 + (taxableIncome - 45_500) * 0.25;
			else if (taxableIncome <= 190_200)
				tax = 11_959 * 0.10 + (taxableIncome - 11_950) * 0.15 + (taxableIncome - 45_500) * 0.25
						+ (taxableIncome - 117_450) * 0.28;
			else if (taxableIncome <= 372_950)
				tax = 11_959 * 0.10 + (taxableIncome - 11_950) * 0.15 + (taxableIncome - 45_500) * 0.25
						+ (taxableIncome - 117_450) * 0.28 + (taxableIncome - 190_200) * 0.33;
			else
				tax = 11_959 * 0.10 + (taxableIncome - 11_950) * 0.15 + (taxableIncome - 45_500) * 0.25
						+ (taxableIncome - 117_450) * 0.28 + (taxableIncome - 190_200) * 0.33
						+ (taxableIncome - 372_950) * 0.35;
		}
		return tax;
	}

	public static void displayTable() {
		String header = "TI\tSOrQW\tMJ\tMS\tHH";
		System.out.println(header);
		printHypen(header.length() + 21);
		for (int i = 50_000; i <= 60_000; i += 50) {
			for (int j = -1; j < 4; ++j) {
				if (j == -1)
					System.out.print(i + "\t");
				else
					System.out.print(computeTax(j, i) + "\t");
			}
			System.out.println();
		}
	}

	public static void printHypen(int length) {
		for (int i = 0; i < length; ++i)
			System.out.print("-");
		System.out.println();
	}
}
