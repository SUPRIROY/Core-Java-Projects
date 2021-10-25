package com.cg.tmd.pojo;

public class TeamBO {
	public Team createTeam(String data, Player[] playerList) {

		Team team = new Team();
		String[] input = data.split(",");
		team.setName(input[0]);
		Player teamPlayer = new Player();
		for (Player player : playerList) {
			if (player.getName().toLowerCase().hashCode() == input[1].toLowerCase().hashCode())

			{
				teamPlayer = player;
			}
		}
		team.setPlayer(teamPlayer);
		return team;
	}
}
