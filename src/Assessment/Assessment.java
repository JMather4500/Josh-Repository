package Assessment;

import helpers.InputReader;

import java.util.ArrayList;

public class Assessment
{

    private ArrayList<Song> songs = new ArrayList<Song>();  //
    boolean endProgram = false;

    public void run()  //runs the program from the App.java
    {
        addMusic();

        int choice = 0;
        while (endProgram != true)  //loops between displaying command list and executing the command
        {
            choice = displayCommandList();
            executeCommandList(choice);
        }

        //1. Add a new song to the list of songs
        //2. Remove a song from the list of songs
        //3. Print a list of all the songs stored
        //4. Print a list of songs over a given number of plays
    }

    private void addMusic()
    {

        int addMusicCommand;

        //adding default songs to list
        Song music = new Song("Bad Medicine", "Bon Jovi", 1234); //new music object for song array list
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



    private String addSong() //method for adding songs
    {
        String title = InputReader.getString("Please enter the title of the song ");
        String artist = InputReader.getString("Please enter the name of the artist ");
        Integer count = InputReader.getInt("Please enter the number of listens ");

        Song song = new Song(title, artist, count);
        songs.add(song);
        return title + " " + artist + " " + count;

    }//end of addSong

    private String removeSong() //method to remove song
    {
        String title = InputReader.getString("please enter the title of the song ");
        String artist = InputReader.getString("Please enter the name of the artist ");
        Integer count = InputReader.getInt("Please enter the number of listens ");

        Song song = new Song(title, artist, count);

        //songs.remove(song);
        songs.remove(String.valueOf(title));
        songs.remove(String.valueOf(artist));
        songs.remove(Integer.valueOf(count));

        return title + " " + artist + " " + count;
    }//end of removeSong

    private void printInOrder() //This will print songs with a certain value or more
    {
        int count = InputReader.getInt("Please enter the value you wish to see equal or more of ");

        if (songs => count)
        {
            System.out.println(songs);
        }
            return;
    }//end of Print in order

    private int displayCommandList()
    {

        System.out.println("please enter the number associated with a command");
        System.out.println("1: Add song");
        System.out.println("2: Remove song");
        System.out.println("3.show all songs");
        System.out.println("4: show songs with a certain number of plays or more ");
        System.out.println("5: end program");

        int songListCommand = InputReader.getInt("What do you want to do? ");
        return songListCommand;
    }//end of displayCommandList

    private void executeCommandList(int songListCommand)
    {


        if (songListCommand == 1)   //This will prompt the user to enter a new song
        {
            addSong();


        }

        else if (songListCommand == 2) // This will prompt the user to remove a song
        {
            removeSong();

        }

        else if (songListCommand == 3)  // This will display the songs as they appear in the array
        {
            System.out.println(songs);
        }
        else if (songListCommand == 4) //This will display songs over a given number of plays
        {
            printInOrder();

        }
        else if (songListCommand == 5) // this will end the loop
        {
            endProgram = true;
        }
        else
        {
            System.out.println("This command is not recognised. PLease enter a valid command");
        }//end of if statement




    } // end of executeCommandList
}//End of Assessment
