package org.ipl;

import java.util.Scanner;

public class Tournment {
	
	private String tournmentName;
	private int year;
	
	private Team[] teams;
	private int no_of_teams;
	
	public Tournment(){
		teams = new Team[10];
		no_of_teams = 0;
	}

	public String getTournmentName() {
		return tournmentName;
	}

	public void setTournmentName(String tournmentName) {
		this.tournmentName = tournmentName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void addTeam(){
		teams[no_of_teams] = new Team();
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter team name : ");
		teams[no_of_teams].setTeamName(scan.next());
		
		System.out.println("\nEnter number of players : ");
		int nop = scan.nextInt();
		
		for(int i=0;i<nop;i++)
			teams[no_of_teams].addPlayer();
		
		no_of_teams++;
		
	}
	
	public void displayTournment(){
		System.out.println("Tournment name : "+tournmentName);
		System.out.println("Year : "+year);
		for(int i=0;i<no_of_teams;i++){
			teams[i].displayTeam();
		}
	}
	

}
