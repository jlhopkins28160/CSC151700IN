/* Programmer: Johnny L. Hopkins
   Date: January 29, 2019
   Course: CSC 151 700IN
   Instructor: Dr. Dana Anderson
   Newproduct.java: Uses the Scanner class to take three floating values as input and return the product of
   those floating numbers. This is a modification of the Product.java program which uses the Scanner class to get 
   floating numbers from the end user.
*/

// Class used for console input/output in Java
import java.util.Scanner;

public class Newproduct
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // Declare new Scanner object.

        // Scan the first number and assign it to variable x
        System.out.print("Enter the first number:");
        double x = input.nextDouble();

        // Scan the first number and assign it to variable y
        System.out.print("Enter the first number:");
        double y = input.nextDouble();

        // Scan the first number and assign it to variable z
        System.out.print("Enter the first number:");
        double z = input.nextDouble();

        // Find the product of x, y, and z
        double result = x * y * z;

        // Output the product to the screen
        System.out.printf("Product is %.2f%n", result);

    }
}