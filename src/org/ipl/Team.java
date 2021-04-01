package org.ipl;

import java.util.Scanner;

public class Team {
	
	private String teamName;
	private Player[] players;
	private int no_of_players;
	
	public Team(){
		players = new Player[20];
		no_of_players = 0;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public void addPlayer(){
		players[no_of_players] = new Player();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter player id and name");
		players[no_of_players].setPlayerId(scan.nextInt());
		players[no_of_players].setPlayerName(scan.next());
		
		no_of_players++;
	}
	
	public void displayTeam(){
		System.out.println("Team name : "+teamName);
		System.out.println("No of players : "+no_of_players);
		for(int i=0;i<no_of_players;i++)
			System.out.println(players[i]);
		
	}

}
