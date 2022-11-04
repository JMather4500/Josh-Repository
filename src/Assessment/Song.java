package Assessment;

public class Song {

    private Integer id;

    private static Integer songNumber = 0;
    private String title;

    private String artistName;

    private int playCount;

    public Song(String title, String name, int count)
    {
        this.title = title;
        this.artistName = name;
        this.playCount = count;
        songNumber++;
        this.id = songNumber;

    }

    public String toString()
    {
        return "Song ID: " + title + " by " + artistName + " plays " + playCount + "\n";
    }
}

