package org.ipl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Tournment ipl = new Tournment();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter tournment name and year");
		ipl.setTournmentName(scan.next());
		ipl.setYear(scan.nextInt());
		
		ipl.addTeam();
		ipl.addTeam();
		
		ipl.displayTournment();

	}

}
