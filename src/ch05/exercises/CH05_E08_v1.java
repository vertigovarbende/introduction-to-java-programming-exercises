package ch05.exercises;

import java.util.Scanner;

public class CH05_E08_v1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		String maxName = "";
		
		System.out.print("Enter number of the students: ");
		int ogrSayi = scan.nextInt();
		
		for (int i = 0; i < ogrSayi; ++i) {
			System.out.print("Enter student's name: ");
			String ogrAdi = scan.next();
			
			System.out.print("Enter stundet's point: ");
			int ogrPuan = scan.nextInt();
			
			if (i == 0) {
				max = ogrPuan;
				maxName = ogrAdi;
				continue;
			}
			else if (max < ogrPuan) {
				max = ogrPuan;
				maxName = ogrAdi;

			}
		}
		
		System.out.println(maxName + " -> " + max);
	}

}
