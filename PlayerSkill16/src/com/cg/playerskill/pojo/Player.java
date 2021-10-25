package com.cg.playerskill.pojo;

public class Player {
	public String name;
	public String country;
	public Skill skill;
	public Player(String name, String country, Skill skill) {
		super();
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	
}
