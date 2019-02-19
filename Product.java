/* Programmer: Johnny L. Hopkins
   Date: January 28, 2019
   Course: CSC 151 700IN
   Instructor: Dr. Dana Anderson
   Product.java: Uses the Scanner class to take three integers as input and return the product of
   those integers
*/

// Class used for console input/output in Java
import java.util.Scanner;

public class Product
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // Declare new Scanner object.
        
        // Scan the first number and assign it to variable x
        System.out.print("Enter the first number:");
        int x = input.nextInt();
        
        // Scan the second number and assign it to variable y
        System.out.print("Enter the second number:");
        int y = input.nextInt();
        
        // Scan the third number and assign it to variable z
        System.out.print("Enter the third number:");
        int z = input.nextInt();

        // Find the product of x, y, and z
        int result = x * y * z;

        // Output the product to the screen
        System.out.printf("Product is %d%n", result);

    }
}