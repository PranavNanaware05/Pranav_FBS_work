package CulturalFest;
class Artist
{
	String ArtistName;

	Artist(String artistName) {
        this.ArtistName = artistName;
    }

    public String getArtistName() {
        return ArtistName;
    }
	
}
class Painter extends Artist {

	Painter(String artistName) {
		super(artistName);
    }
}
class Musician extends Artist {

    String instrument;

    Musician(String artistName, String instrument) {
        super(artistName);
        this.instrument = instrument;
    }

    public String getInstrument() {
        return instrument;
    }
}

class Actor extends Artist {

    Actor(String artistName) {
        super(artistName);
    }
}
public class test_CulturalFest {
	 public static void checkMusicEventEligibility(Artist a) {

	        if (a instanceof Musician) {

	            Musician m = (Musician) a;   // Downcasting

	            System.out.println("Musician " + m.getArtistName() +
	                    " is allowed for the Music Event and is playing "
	                    + m.getInstrument());
	        } 
	        else {

	            System.out.println(a.getArtistName() +
	                    " is not allowed for the Music Event");
	        }
	    }

	    public static void main(String[] args) {

	        // Artist array
	        Artist arr[] = new Artist[4];

	        arr[0] = new Painter("Ravi");
	        arr[1] = new Musician("Arjun", "Guitar");
	        arr[2] = new Actor("Karan");
	        arr[3] = new Musician("Meera", "Violin");

	        // Basic for loop
	        for (int i = 0; i < arr.length; i++) {

	            checkMusicEventEligibility(arr[i]);

	        }
	    }

}
