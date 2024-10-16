package Solution;

import java.util.Scanner;

public class USGradingSystem
{
    // Method to convert numerical grade to letter grade
    public static String getLetterGrade(double grade)
    {
        // Check for invalid grade inputs
        if (grade < 0 || grade > 100)
        {
            return "Invalid grade input. Please enter a grade between 0 and 100.";
        }

        // Return letter grade based on the grade
        if (grade >= 97)
        {
            return "A+";
        }
        else if (grade >= 93)
        {
            return "A";
        }
        else if (grade >= 90)
        {
            return "A−";
        }
        else if (grade >= 87)
        {
            return "B+";
        }
        else if (grade >= 83)
        {
            return "B";
        }
        else if (grade >= 80)
        {
            return "B−";
        }
        else if (grade >= 77)
        {
            return "C+";
        }
        else if (grade >= 73)
        {
            return "C";
        }
        else if (grade >= 70)
        {
            return "C−";
        }
        else if (grade >= 67)
        {
            return "D+";
        }
        else if (grade >= 63)
        {
            return "D";
        }
        else if (grade >= 60)
        {
            return "D−";
        }
        else
        {
            return "F";
        }
    }

    // Main method for user interaction
    public static void main(String[] args)
    {
        // Create scanner object to read input from the user
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user for their grade
        System.out.print("Enter your numerical grade: ");
        double grade = keyboard.nextDouble();

        // Call the getLetterGrade method to get the letter grade
        String letterGrade = getLetterGrade(grade);

        // Output the letter grade
        System.out.println("Your letter grade is: " + letterGrade);

        // Close the scanner object
        keyboard.close();
    }
}
