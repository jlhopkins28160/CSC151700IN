/* Programmer: Johnny L. Hopkins
   Date: February 22, 2019
   Course: CSC 151 700IN
   Instructor: Dr. Dana Anderson
   NewProductDialog.java: Similar to ProductDialog.java, but uses floating point values.
*/

// The Swing API must be called when using JOptionPane().showInputDialog() and JOptionPane.showMessageDialog.
import javax.swing.*;

public class NewProductDialog
{
    public static void main(String[] args)
    {
        // Obtain input from JOptionPane dialogs
        String firstValue = JOptionPane.showInputDialog("Enter the first value");
        String secondValue = JOptionPane.showInputDialog("Enter the second value");
        String thirdValue = JOptionPane.showInputDialog("Enter the third value");

        // Convert strings to integers
        double x = Double.parseDouble(firstValue);
        double y = Double.parseDouble(secondValue);
        double z = Double.parseDouble(thirdValue);

        // Find the product
        double product = x * y * z;

        // Output the results
        JOptionPane.showMessageDialog(null, "The product is " + product, "Product of Three Integers",
                JOptionPane.PLAIN_MESSAGE);
    }
}