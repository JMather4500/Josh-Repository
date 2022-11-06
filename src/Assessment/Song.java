package Assessment;


/**
 * This class gives value to the song id, song title, artist name, and number of plays
 * it also creates SongNumber integer
*/
public class Song {

    private int id; //holds the value of the ID

    private static Integer songNumber = 0; //tells the code that the base id is 0
    private String title; // holds value for th title of the song

    private String artistName; //holds value for the artists name

    private int playCount; //holds the value for the amount of times a song has been played


    public Song(String title, String name, int count) //makes it possible to access the private objects above
    {
        this.title = title;
        this.artistName = name;
        this.playCount = count;
        songNumber++;
        this.id = songNumber;

    }// end of accessing the private objects

    public String toString() //shows the code how to arrange the values when displaying them
    {
        return "Song ID: " + id + "Song Name " +  title + " by " + artistName + " plays " + playCount + "\n";
    }// end of toString arrangement

    public int getPlayCount() // makes it possible to access playCount from outside the Class
    {
        return playCount;
    }  // end of getPlayCount
}//end of Song

