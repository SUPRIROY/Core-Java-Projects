package com.cg.tmd.pojo;

public class PlayerBO {
	public Player createPlayer(String data) {

		Player player = new Player();
		String[] input = data.split(",");
		player.setName(input[0]);
		player.setCountry(input[1]);
		player.setSkill(input[2]);
		return player;
	}
}
