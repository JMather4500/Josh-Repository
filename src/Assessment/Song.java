package Assessment;


/**
 * This class stores information to be used later
 * it also creates an ID using songNumber
 * @author Joshua
*/
public class Song {

    private int id;

    private static Integer songNumber = 0;
    private String title;

    private String artistName;

    private int playCount;

    /**
     * This method accesses the private methods above
     * This allows the code in Assessment.java to use them even though they are privat
     */
    public Song(String title, String name, int count)
    {
        this.title = title;
        this.artistName = name;
        this.playCount = count;
        songNumber++;
        this.id = songNumber;

    }// end of accessing the private objects

    /**
     *This code tells the code how to arrange the values of the Arraylist when displaying them to the user
     */
    public String toString()
    {
        return "Song ID: " + id + "Song Name " +  title + " by " + artistName + " plays " + playCount + "\n";
    }// end of toString arrangement

    /**
     * Makes it possible to access playCount from outside the Class
     */
    public int getPlayCount()
    {
        return playCount;
    }  // end of getPlayCount
}//end of Song

