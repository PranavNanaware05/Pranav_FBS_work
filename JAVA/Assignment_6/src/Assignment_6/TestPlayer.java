package Assignment_6;

class Player {
    String name;
    int age;
    String country;
    int matchesPlayed;
    int jerseyNumber;
    Player() {
        this.name = "Unknown";
        this.age = 0;
        this.country = "Unknown";
        this.matchesPlayed = 0;
        this.jerseyNumber = 0;
    }
    Player(String name, int age, String country, int matchesPlayed, int jerseyNumber) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.matchesPlayed = matchesPlayed;
        this.jerseyNumber = jerseyNumber;
    }
      void play()
      {
    	  System.out.println("Playing");
      }
	@Override
	public String toString() {
		return "Pname=" + name + "\nage=" + age + "\ncountry=" + country + "\nmatchesPlayed=" + matchesPlayed
				+ "\njerseyNumber=" + jerseyNumber;
	}
    
}//Player ends here


class CricketPlayer extends Player {
    int totalRuns;
    int totalWickets;
    String battingStyle;
    String bowlingStyle;

    CricketPlayer(String name, int age, String country, int matchesPlayed, int jerseyNumber,
                  int totalRuns, int totalWickets, String battingStyle, String bowlingStyle) {

        super(name, age, country, matchesPlayed, jerseyNumber);
        this.totalRuns = totalRuns;
        this.totalWickets = totalWickets;
        this.battingStyle = battingStyle;
        this.bowlingStyle = bowlingStyle;
    }

    void play()
    {
  	  System.out.println("Playing Cricket");
    }

	@Override
	public String toString() {
		return super.toString()+"\ntotalRuns=" + totalRuns + "\ntotalWickets=" + totalWickets + ", battingStyle="
				+ battingStyle + "\nbowlingStyle=" + bowlingStyle ;
	}
    
}//CricketPlayer ends here


class FootballPlayer extends Player {
    int totalGoals;
    String playingPosition;

    FootballPlayer(String name, int age, String country, int matchesPlayed, int jerseyNumber,
                   int totalGoals, String playingPosition) {

        super(name, age, country, matchesPlayed, jerseyNumber);
        this.totalGoals = totalGoals;
        this.playingPosition = playingPosition;
    }

    void play()
    {
  	  System.out.println("Playing FootBall");
    }

	@Override
	public String toString() {
		return super.toString()+"\ntotalGoals=" + totalGoals + "\nplayingPosition=" + playingPosition ;
	}
    
}//FootballPlayer ends here


public class TestPlayer {
    public static void main(String[] args) {
         System.out.println("-----Player-------");
         Player p1=new Player();
         p1.play();
         System.out.println(p1);
       System.out.println("----- Cricket Player -----");
        p1 = new CricketPlayer("Virat Kohli", 35, "India", 500, 18,25000, 4, "Right-handed", "Right-arm medium");
        p1.play();
        System.out.println(p1);

        System.out.println("\n----- Football Player -----");
        p1 = new FootballPlayer(
                "Lionel Messi", 37, "Argentina", 800, 10,
                720, "Forward" );
       p1.play();
       System.out.println(p1);
    }
}