package Assessment;

import helpers.InputReader;

import java.util.ArrayList;
public class Assessment {
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";

    public static void main(String[] args) {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 2 Java Selection & Iteration ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();


        songList();
        //1. Add a new song to the list of songs
        //2. Remove a song from the list of songs
        //3. Print a list of all the songs stored
        //4. Print a list of songs over a given number of plays
    }

    private static void songList() {

        int songListCommand;

        ArrayList<String> songs = new ArrayList<String>();
            songs.add("Bad Medicine",2264,ints);
            songs.add("Bohemian Rhapsody", 5568,ints);
            songs.add("Passage To Bangkok", 2589,ints) ;
            songs.add("Heat of the Moment"1598,ints);
            songs.add("The Spirit Of Radio"6894,ints);
            songs.add("Freewill",8498,ints);
            songs.add("Uprising",2254,ints);
        System.out.println(songs);

        System.out.println("please enter the number associated with a command");
        System.out.println("1: Add song");
        System.out.println("2: Remove song");
        System.out.println("3.show all songs");
        System.out.println("4: show songs with a certain number of plays or more ");

        songListCommand = InputReader.getInt("What do you want to do? ");

            if (songListCommand == 1)   //This will prompt the user to enter a new song
            {
                songs.add(InputReader.getString("Please enter the name of the song you want to add "));
            }
            else if (songListCommand == 2) // This will prompt the user to remove a song
            {
                songs.remove(InputReader.getInt("Please enter the name of the song you wish to remove "));
            }
            else if (songListCommand == 3)  // This will display the songs as they appear in the array
            {
            System.out.println(songs);
            }
            else if (songListCommand == 4) //This will display songs over a given number of plays
            {
            System.out.println("test");
            }//end of if statement
    }

    }
