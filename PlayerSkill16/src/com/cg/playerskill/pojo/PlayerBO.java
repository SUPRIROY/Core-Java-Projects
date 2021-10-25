package com.cg.playerskill.pojo;

public class PlayerBO {
	public void viewDetails(Player[] playerList) {
		System.out.println("Player \t Country  Skill");
		for (Player player : playerList) {
			System.out.printf("%s\t %s\t %s\t", player.name, player.country, player.skill.getSkillName());
			System.out.println();
		}
		System.out.println("\n\n");
	}

	public void printPlayerDetailsWithSkill(Player[] playerList, String skill) {
		System.out.println(skill);
		for (Player player : playerList) {
			if (player.skill.getSkillName().toLowerCase().hashCode() == skill.toLowerCase().hashCode()) {

				System.out.printf("%s, %s, %s", player.name, player.country, player.skill.getSkillName());
				System.out.println();
			} else {

			}

		}
	}
}
