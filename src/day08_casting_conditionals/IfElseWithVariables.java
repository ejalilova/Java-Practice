package day08_casting_conditionals;

public class IfElseWithVariables {
	public static void main(String[] args) {
		int temperature = 65;
		
		if (temperature >= 65) {
			
			System.out.println("It is a nice day! Lets code java");
		}else {
			System.out.println("Stay home and code java");
		}
		
		//2 int variables, teamAScore, teamBScore
		//put a condition. icheck if teamA won. "Team A won"
		//Got to Team A!
		//else we print "team b won or it was a draw
		//Go Teams!
		
		int teamAScore = 5;
		int teamBScore = 3;
		
		if (teamAScore>teamBScore) {
			
			System.out.println("Team A won. Go Team A!");
		}else {
			System.out.println("Team B won!");
			
		}
		
		
	}

}
