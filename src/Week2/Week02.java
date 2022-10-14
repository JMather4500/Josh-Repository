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

        multiplyBySeven();
        doSevenTimesTable();


    }
    private static void multiplyBySeven() //multiplys by seven up to 12
    {
        int multiplicand = 7;
        int multiplier = 1;

        while(multiplier <= 12) //the loop keeps going until multiplier is equal to or less than 12
        {
            int product = multiplicand * multiplier; //the sum of multiplier and multiplicand

            System.out.println(product); //prints the product
            multiplier = multiplier +1; //adds one to multiplier and restarts the loop
        }
    }//end of multiplyBySeven

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
