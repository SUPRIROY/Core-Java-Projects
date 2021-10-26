

public class Player {
	
	//Initialising the variable
	private String name;
	private String country;
	private String skill;
	
	
	//Parameterised Constructor to set the values
	public Player(String name, String country, String skill) {
		super();
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", country=" + country + ", skill=" + skill + "]";
	}
	//getter metgod te return the name of player
	public String getName() {
		return name;
	}
	//getter metgod te return the country of player
	public String getCountry() {
		return country;
	}
	//getter metgod te return the skill of player
	public String getSkill() {
		return skill;
	}
	
	

}
