package Assessment;

import helpers.InputReader;

import java.util.ArrayList;

public class Assessment
{

    static ArrayList<Song> songs = new ArrayList<Song>();  //


    public static void main(String[] args)
    {
        addMusic();
        displayCommandList();
        executeCommandList();

        //1. Add a new song to the list of songs
        //2. Remove a song from the list of songs
        //3. Print a list of all the songs stored
        //4. Print a list of songs over a given number of plays
    }

    private static void addMusic()
    {

        int addMusicCommand;

        //adding default songs to list
        Song music = new Song("Bad Medicine", "artist", 1234); //new music object for song array list
        songs.add(music); //adding to list

        music = new Song("Bohemian Rhapsody", "Queen", 50000);
        songs.add(music);

        music =  new Song("Passage To Bangkok", "Rush", 3215);
        songs.add(music);

        music = new Song("Heat of the Moment", "NSP", 5674);
        songs.add(music);

        music = new Song("The Spirit Of Radio", "Rush", 24685);
        songs.add(music);

        music = new Song("Freewill", "Rush", 84544);
        songs.add(music);

        music =  new Song("Uprising", "Muse", 45746);
        songs.add(music);
    }//end of addMusic

    private static void displayCommandList()
    {

        System.out.println("please enter the number associated with a command");
        System.out.println("1: Add song");
        System.out.println("2: Remove song");
        System.out.println("3.show all songs");
        System.out.println("4: show songs with a certain number of plays or more ");
        System.out.println("5: end program");
    }//end of displayCommandList

    private static String addSong() //method for adding songs
    {
        String title = InputReader.getString("Please enter the title of the song ");
        String artist = InputReader.getString("Please enter the name of the artist ");
        Integer count = InputReader.getInt("Please enter the number of listens ");

        Song song = new Song(title, artist, count);
        return title + " " + artist + " " + count;
    }//end of addSong

    private static void removeSong() //method to remove song
    {
        String title = InputReader.getString("please enter the title of the song ");
        String artist = InputReader.getString("Please enter the name of the artist ");
        Integer count = InputReader.getInt("Please enter the number of listens ");

        Song song = new Song(title, artist, count);
        songs.remove(song);
    }//end of removeSong


    private static String executeCommandList()
    {
        int songListCommand = InputReader.getInt("What do you want to do? ");

        while (songListCommand != 5)
        {
            if (songListCommand == 1)   //This will prompt the user to enter a new song
            {
                addSong();
                songListCommand = InputReader.getInt("What do you want to do? ");
            }

            else if (songListCommand == 2) // This will prompt the user to remove a song
            {
                removeSong();
                songListCommand = InputReader.getInt("What do you want to do? ");
            }

            else if (songListCommand == 3)  // This will display the songs as they appear in the array
            {
                System.out.println(songs);
                songListCommand = InputReader.getInt("What do you want to do? ");
            }
            else if (songListCommand == 4) //This will display songs over a given number of plays
            {
                System.out.println("test");
                songListCommand = InputReader.getInt("What do you want to do? ");

            }
            else
            {
                System.out.println("This command is not recognised. PLease enter a valid command");
                songListCommand = InputReader.getInt("What do you want to do? ");
            }//end of if statement

        }//end of while loop


        return null;
    } // end of executeCommandList
}//End of Assessment
