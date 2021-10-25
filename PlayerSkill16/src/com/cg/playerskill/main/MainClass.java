package com.cg.playerskill.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.playerskill.pojo.Player;
import com.cg.playerskill.pojo.PlayerBO;
import com.cg.playerskill.pojo.Skill;

public class MainClass {

	public static void main(String[] args) {
		int noOfPlayers = 0;
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Enter Numbers of Players");
			noOfPlayers = sc.nextInt();
			sc.nextLine();
			Player[] listOfPlayer = new Player[noOfPlayers];

			for (int i = 0; i < noOfPlayers; i++) {

				String playername = "";
				String countryName = "";
				String skill = "";

				System.out.println("Enter Player " + (i + 1) + " details: ");
				System.out.println("Enter player name");
				playername = sc.nextLine();
				System.out.println("Enter country name");
				countryName = sc.nextLine();
				System.out.println("Enter skill");
				skill = sc.nextLine();

				Skill playerSkill = new Skill();
				playerSkill.setSkillName(skill);

				Player player = new Player(playername, countryName, playerSkill);
				listOfPlayer[i] = player;
			}

			PlayerBO playerBO = new PlayerBO();

			boolean areUDone = true;
			while (areUDone) {
				System.out.println("\n\nMenu:");
				System.out.println("1. View Details");
				System.out.println("2. Filter Player with Skill");
				System.out.println("3. Exit");
				int choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {

				case 1:
					playerBO.viewDetails(listOfPlayer);
					break;

				case 2:
					System.out.println("Enter Skill: ");
					String filter = sc.nextLine();
					playerBO.printPlayerDetailsWithSkill(listOfPlayer, filter);
					break;

				case 3:
					sc.close();
					System.exit(0);
					break;

				default:
					System.out.println("Invalid option");
					break;

				}

			}

		} catch (InputMismatchException err) {

			System.out.println("Unsupported Input, Enter integer value");
		} finally {
			sc.close();
			System.exit(1);
		}
	}

}
