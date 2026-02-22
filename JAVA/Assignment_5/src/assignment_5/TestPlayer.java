package assignment_5;


class Player {
    String name;
    int age;
    String country;
    int matchesPlayed;
    int jerseyNumber;

    Player(String name, int age, String country, int matchesPlayed, int jerseyNumber) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.matchesPlayed = matchesPlayed;
        this.jerseyNumber = jerseyNumber;
    }

    void display() {
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Country        : " + country);
        System.out.println("Matches Played : " + matchesPlayed);
        System.out.println("Jersey Number  : " + jerseyNumber);
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

    
    void display() {
        super.display();
        System.out.println("Total Runs     : " + totalRuns);
        System.out.println("Total Wickets  : " + totalWickets);
        System.out.println("Batting Style  : " + battingStyle);
        System.out.println("Bowling Style  : " + bowlingStyle);
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

    
    void display() {
        super.display();
        System.out.println("Total Goals    : " + totalGoals);
        System.out.println("Playing Position: " + playingPosition);
    }
}//FootballPlayer ends here


public class TestPlayer {
    public static void main(String[] args) {

        System.out.println("----- Cricket Player -----");
        CricketPlayer cp = new CricketPlayer(
                "Virat Kohli", 35, "India", 500, 18,
                25000, 4, "Right-handed", "Right-arm medium"
        );
        cp.display();

        System.out.println("\n----- Football Player -----");
        FootballPlayer fp = new FootballPlayer(
                "Lionel Messi", 37, "Argentina", 800, 10,
                720, "Forward" );
        fp.display();
    }
}