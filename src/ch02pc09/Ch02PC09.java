package ch02pc09;
import java.util.Scanner;
/**
 *
 * @author FRANK.OLSON
 * date     10/18/2017
 * purpose  Calculate the mpg based on input
 */
public class Ch02PC09 {

    public static void main(String[] args) {
        //variables
        double mpg, miles, gas;
        
        //Scanner object to read input
        Scanner keyboard = new Scanner(System.in);
        
        //Request user input
        System.out.print("How many miles did you drive? ");
        miles = keyboard.nextDouble();
        
        System.out.print("How many gallons of gas did you use? ");
        gas = keyboard.nextDouble();
        
        //Calculations
        mpg = miles / gas;
        
        //Output results
        System.out.print("Your consumption was: " + mpg + " miles per gallon."
        );
    }
    
}
