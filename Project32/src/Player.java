

class Player
{
	//Declaring the Variables
	String capNumber;
	String playerName;
	String skill;
	String country;
	String matchesPlayed;

	//using the Parameterised constructor to set the values
	public Player(String capNumber, String playerName, String skill, String country, String matchesPlayed) {
		super();
		this.capNumber = capNumber;
		this.playerName = playerName;
		this.skill = skill;
		this.country = country;
		this.matchesPlayed = matchesPlayed;
	}
	
	
	
	
	//getter methods are used to display the values passed to constructor
	public String getCapnumber()
	{
		return capNumber;
	}
	public String getPlayername()
	{
		return playerName;
	}
	public String getSkill()
	{
		return skill;
	}
	public String getCountry()
	{
		return country;
	}
	public String getMatchesplayed()
	{
		return matchesPlayed;
	}
}
