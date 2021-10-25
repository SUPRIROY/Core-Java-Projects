package com.cg.tmd.pojo;

public class MatchBO {
	public Match createMatch(String data, Team[] teamList) {
		Match match = new Match();
		String[] input = data.split(",");
		match.setDate(input[0]);
		Team tempTeam1 = new Team();
		Team tempTeam2 = new Team();
		for (Team team : teamList) {
			if (team.getName().toLowerCase().hashCode() == input[1].toLowerCase().hashCode())

			{
				tempTeam1 = team;
			}

			if (team.getName().toLowerCase().hashCode() == input[2].toLowerCase().hashCode())

			{
				tempTeam2 = team;
			}
		}
		match.setTeamone(tempTeam1);
		match.setTeamtwo(tempTeam2);
		match.setVenue(input[3]);
		match.setTeam(null);
		return match;
	}

	public void findTeam(String matchDate, Match[] matchList) {
		for (Match match : matchList) {
			if (match.getDate().toLowerCase().hashCode() == matchDate.toLowerCase().hashCode()) {
				System.out.println("Team");
				System.out.printf("%s, %s", match.getTeamone().getName().toUpperCase(),
						match.getTeamtwo().getName().toUpperCase());
			}

		}
	}

	public void findAllMatchesOfTeam(String teamName, Match[] matchList) {

		for (Match match : matchList) {
			if (match.getTeamone().getName().toLowerCase().hashCode() == teamName.toLowerCase().hashCode()
					|| match.getTeamtwo().getName().toLowerCase().hashCode() == teamName.toLowerCase().hashCode()) {
				System.out.println("Team");
				System.out.printf("%s, %s, %s, %s", match.getDate(), match.getTeamone().getName().toUpperCase(),
						match.getTeamtwo().getName().toUpperCase(), match.getVenue());
			}

		}
	}
}
