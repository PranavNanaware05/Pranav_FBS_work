package assignment_5;


class Artist {
    String name;
    int age;

    Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}//class Artist ends here


class Painter extends Artist {
    String paintingStyle;
    String mediumUsed;
    int numberOfPaintings;

    Painter(String name, int age, String paintingStyle,
            String mediumUsed, int numberOfPaintings) {

        super(name, age);
        this.paintingStyle = paintingStyle;
        this.mediumUsed = mediumUsed;
        this.numberOfPaintings = numberOfPaintings;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Painting Style      : " + paintingStyle);
        System.out.println("Medium Used         : " + mediumUsed);
        System.out.println("Number of Paintings : " + numberOfPaintings);
    }
}//class Painter ends here


class Musician extends Artist {
    String instrument;
    String musicGenre;
    int numberOfAlbums;

    Musician(String name, int age, String instrument,
             String musicGenre, int numberOfAlbums) {

        super(name, age);
        this.instrument = instrument;
        this.musicGenre = musicGenre;
        this.numberOfAlbums = numberOfAlbums;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Instrument        : " + instrument);
        System.out.println("Music Genre       : " + musicGenre);
        System.out.println("Number of Albums  : " + numberOfAlbums);
    }
}//class Musician ends here


class Actor extends Artist {
    String filmIndustry;
    int numberOfMovies;

    Actor(String name, int age, String filmIndustry, int numberOfMovies) {

        super(name, age);
        this.filmIndustry = filmIndustry;
        this.numberOfMovies = numberOfMovies;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Film Industry    : " + filmIndustry);
        System.out.println("Number of Movies : " + numberOfMovies);
    }
}//class Actor ends here


public class TestArtist {
    public static void main(String[] args) {

        System.out.println("----- Painter -----");
        Painter p = new Painter("Ravi", 40, "Abstract", "Oil", 120);
        p.display();

        System.out.println("\n----- Musician -----");
        Musician m = new Musician("A.R. Rahman", 58, "Keyboard", "Film Music", 200);
        m.display();

        System.out.println("\n----- Actor -----");
        Actor a = new Actor("Shah Rukh Khan", 59, "Bollywood", 90);
        a.display();
    }
}