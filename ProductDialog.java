/* Programmer: Johnny L. Hopkins
   Date: Febrauary 22, 2019
   Course: CSC 151 700IN
   Instructor: Dr. Dana Anderson
   ProductDialog.java: A modification of Exercise 2.6, pg. 61(Deitel) using JOptionPane().showInputDialog
   and JOptionPane.showMessageDialog(). This example uses integer values
*/

// The Swing API must be called when using JOptionPane().showInputDialog() and JOptionPane.showMessageDialog.
import javax.swing.*;

public class ProductDialog
{
    public static void main(String[] args)
    {
        // Obtain input from JOptionPane dialogs
        String firstValue = JOptionPane.showInputDialog("Enter the first value");
        String secondValue = JOptionPane.showInputDialog("Enter the second value");
        String thirdValue = JOptionPane.showInputDialog("Enter the third value");

        // Convert strings to integers
        int x = Integer.parseInt(firstValue);
        int y = Integer.parseInt(secondValue);
        int z = Integer.parseInt(thirdValue);

        // Find the product
        int product = x * y * z;
        
        // Output the results
        JOptionPane.showMessageDialog(null, "The product is " + product, "Product of Three Integers",
                JOptionPane.PLAIN_MESSAGE);
    }
}


