/**
 * Give the user the option to choose between 6 math functions.
 *
 * @author (Sienna)
 * @version (1.0)
 */

import java.util.Scanner;

public class JavaMathFunctions
{
    public static void main(String[] args)
    {
        System.out.print('\u000C');
        
        Scanner userInput = new Scanner(System.in);
        int decision;
        double x;
        double y;
        double results; 
        
        //choices
        System.out.println("What math function would you like to use?");
        System.out.println("Type \"1\" to find the number with the highest value."); //Math.max(x,y)
        System.out.println("Type \"2\" to find the number with the lowest value."); //Math.min(x,y)
        System.out.println("Type \"3\" to find the square root of a number.");  //Math.sqrt(x)
        System.out.println("Type \"4\" to find the absolute value of a number.");  //Math.abs(x)
        System.out.println("Type \"5\" to be given a random number.");  //Math.random()
        System.out.println("Type \"6\" to find x to the power of y");  //Math.pow(x,y)
        System.out.println(" ");
        
        System.out.print("You have chosen: ");
        decision = userInput.nextInt();
        
        //options 1-3
        if (decision <= 3) //types1-3
        {
            if (decision < 1)
            {
                System.out.println("Please enter a number from 1-7");
            }
            else
            {
                if (decision == 1)
                {
                    //variables
                    System.out.println("You have chosen 1: find the number with the highest value. Please define your variables.");
                    System.out.print("x = ");
                    x = userInput.nextDouble();
                    System.out.print("y = ");
                    y = userInput.nextDouble();
                    System.out.println(" ");
                    //results
                    results = Math.max(x,y);
                    System.out.print("The number with the greater value is " + results + ".");
                }
                else if (decision == 2)
                {
                    //variables
                    System.out.println("You have chosen 2: find the number with the lowest value. Please define your variables.");
                    System.out.print("x = ");
                    x = userInput.nextDouble();
                    System.out.print("y = ");
                    y = userInput.nextDouble();
                    System.out.println(" ");
                    //results
                    results = Math.min(x,y);
                    System.out.print("The number with the lesser value is " + results + ".");
                }
            else
                {
                    //variables
                    System.out.println("You have chosen 3: find the square root of a number. Please define your variable.");
                    System.out.print("x = ");
                    x = userInput.nextDouble();
                    System.out.println(" ");
                    //results
                    results = Math.sqrt(x);
                    System.out.print("The square root of " + x + " is " + results + ".");
                }
        }
        }
        else
        {
            if (decision >= 4)
            {
                if (decision > 6)
                {
                    System.out.println("Please enter a number from 1-7");
                }
                else
                {
                    if (decision == 4)
                    {
                        //variables
                        System.out.println("You have chosen 4: find the absolute value of a number. Please define your variable.");
                        System.out.print("x = ");
                        x = userInput.nextDouble();
                        System.out.println(" ");
                        //results
                        results = Math.abs(x);
                        System.out.print("The absolute value of " + x + " is " + results + ".");
                    }
                    else if (decision == 5)
                    {
                        //variables
                        System.out.println("You have chosen 5: be given a random number.");
                        System.out.println(" ");
                        //results
                        results = Math.random();
                        System.out.print("Your number is " + results + ".");
                    }
                    else
                    {
                        //variables
                        System.out.println("You have chosen 6: find x to the power of y. Please define your variables.");
                        System.out.print("x = ");
                        x = userInput.nextDouble();
                        System.out.print("y = ");
                        y = userInput.nextDouble();
                        System.out.println(" ");
                        //results
                        results = Math.pow(x,y);
                        System.out.print(x + "^" + y + "=" + results);
                    }  
                }
            }
    }
}
}
