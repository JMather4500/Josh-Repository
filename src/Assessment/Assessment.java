package Assessment;

import helpers.InputReader;

import java.util.ArrayList;

public class Assessment
{

    private static ArrayList<Song> songs = new ArrayList<Song>();  //declaring array and linking it to Song Class
    boolean endProgram = false;


    /**
     * runs the program from the App.java
     * this code will perform the following functions
     * 1. Add a new song to the list of songs
     * 2. Remove a song from the list of songs
     * 3. Print a list of all the songs stored
     * 4. Print a list of songs over a given number of plays
     * @author Joshua
     */
    public void run()
    {
        addMusic();

        int choice = 0;
        while (endProgram != true)  //loops between displaying command list and executing the command
        {
            choice = displayCommandList();
            executeCommandList(choice);
        }


    }

    /**
     * creates default values for the Array list
     */
    private void addMusic()
    {

        int addMusicCommand;

        //adding default songs to list
        Song music = new Song( "Bad Medicine", "Bon Jovi", 1234); //new music object for song array list
        songs.add(music); //adding to list

        music = new Song( "Bohemian Rhapsody", "Queen", 50000);
        songs.add(music);

        music =  new Song( "Passage To Bangkok", "Rush", 3215);
        songs.add(music);

        music = new Song( "Heat of the Moment", "NSP", 5674);
        songs.add(music);

        music = new Song("The Spirit Of Radio", "Rush", 24685);
        songs.add(music);

        music = new Song("Freewill", "Rush", 84544);
        songs.add(music);

        music =  new Song("Uprising", "Muse", 45746);
        songs.add(music);
    }//end of addMusic


/**
 * Method to add a new song to the array list
 */
    private String addSong() //method for adding songs
    {
        String title = InputReader.getString("Please enter the title of the song ");
        String artist = InputReader.getString("Please enter the name of the artist ");
        Integer count = InputReader.getInt("Please enter the number of listens ");

        Song song = new Song(title, artist, count);
        songs.add(song);
        return title + " " + artist + " " + count;

    }//end of addSong

    /**
     * Method to remove a song from the array list
     */
    private void removeSong() //method to remove song
    {
        int id = InputReader.getInt("Please enter the ID of the song you wish to remove ");

        songs.remove(id - 1);

        return;
    }//end of removeSong

    /**
     * This method will print songs with over an amount that the user enters
     */
    private int printLarger()
    {
        int count = InputReader.getInt("Please enter the value you wish to see more than ");

        {


            for(int songPosition = 0; songPosition < songs.size(); songPosition++)
            {
                if (count < songs.get(songPosition).getPlayCount())
                System.out.println(songs.get(songPosition).toString());
            }
        }

            return count;
    }//end of printLarger

    /**
     * Presents the user with options
     */
    private int displayCommandList()
    {

        System.out.println("please enter the number associated with a command");
        System.out.println("1: Add song");
        System.out.println("2: Remove song");
        System.out.println("3.show all songs");
        System.out.println("4: show songs with more than a certain number of plays ");
        System.out.println("5: end program");

        int songListCommand = InputReader.getInt("What do you want to do? ");
        return songListCommand;
    }//end of displayCommandList

    /**
     * Executes methods based on user input
     */
    private void executeCommandList(int songListCommand)
    {


        if (songListCommand == 1)
        {
            addSong();


        }

        else if (songListCommand == 2)
        {
            removeSong();

        }

        else if (songListCommand == 3)
        {
            System.out.println(songs);
        }
        else if (songListCommand == 4)
        {
            printLarger();

        }
        else if (songListCommand == 5)
        {
            endProgram = true;
        }
        else
        {
            System.out.println("This command is not recognised. PLease enter a valid command");
        }//end of if statement




    } // end of executeCommandList
}//End of Assessment
