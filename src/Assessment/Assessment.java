package Assessment;

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

        ArrayList<String> songs = new ArrayList<String>();
        songs.add("Bad Medicine");
        songs.add("Bohemian Rhapsody");
        songs.add("Passage To Bangkok") ;
        songs.add("Heat of the Moment");
        songs.add("The Spirit Of Radio");
        songs.add("Freewill");
        songs.add("Uprising");
        System.out.println(songs);

        //for (song song : songs) {
         //   song.print();

        }

    }
