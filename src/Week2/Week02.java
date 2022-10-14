package Week2;

import helpers.InputReader;
public class Week02
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 2 Java Selection & Iteration ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        doSevenTimesTable();


    }
    private static void doSevenTimesTable()
    {

        int multiplicand = 7;
        int product;        //this will be the sum of the mutliplicand and multiplier
        int multiplier;     //This will be inputted by the user

        multiplier = InputReader.getInt("Please enter a value to multiply by 7 ");
        product = multiplicand * multiplier;
        System.out.println(product);

    } //doSevenTimesTable ends


}
