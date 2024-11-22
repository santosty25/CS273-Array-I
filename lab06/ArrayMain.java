import java.io.*;
import java.util.*;

public class ArrayMain {

    /**
     * Our main method.
     *  - Prompt user for a # of elements.
     *  - Create array of that size, using random values in the range
     *    -1000 to 1000, inclusive.
     *  - Compute and print various things about the array's contents.
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Context: Students may have a hard time understanding what 'numElements' is used for
         * and that the 'numberArray' that is created is of size 'numElements'. Students may 
         * also have a hard time understanding that they can reuse the 'numberArray' array
         * for each of the checkpoints instead of creating separate arrays.
         * 
         * Importance: The following print statements provide students feedback so that the
         * students understands what the code does in the beginning before starting the lab.
         * It provides a clear understanding of what 'numberArray' and 'numElements' is used for by
         * reinforcing the idea of what 'numElements' is and how it is being used for 'numberArray'.
         * The updated comments for the instructions also tells students to reuse 'numberArray'. 
         * 
         * Justification: By explaining the code at the start, students are more likely to feel
         * confident in using 'numberArray' throughout the lab. They would have an understanding
         * of what the initiated variables represent as they run the code before working on the checkpoints. 
         * The initial print statements make the code easy to follow and shows how the variables are initialized.
         * The updated comments makes it understandable for students who are still learning
         * how to use arrays. It also reinforces the concept of reusing existing data structures that were already created in the code.
         * 
         */
        System.out.println("Enter a number that will be used for the size of the array 'numberArray'");
        int numElements = getNumElements();
        if (numElements <= 0) {
            System.out.println("We need a positive number.");
            return;
        }

        System.out.println("Creating variable 'numElements' with input " + numElements + ".");
        System.out.println("Note: The numberArray will use 'numElements' as its size, "
                + "and will contain random values between -1000 and 1000.");
                
        // Create an array (numberArray) of size 'numElements' and insert random numbers
        int[] numberArray = createNumberArray(numElements);
        System.out.println("Creating numberArray array with size of your input (numElements): " + numElements + ".");

        /////////////////////////////////////////////////////////////////
        //   At this point, the array has been created and initialized.
        /////////////////////////////////////////////////////////////////

        // ***** CHECKPOINT 1 *****
        // Print the numbers in numberArray, followed by a line of dashes


        // ***** CHECKPOINT 2 *****
        // Compute & print the average of the numbers in numberArray


        //System.out.println("The average of the numbers is "+???);

        
        // ***** CHECKPOINT 3 *****
        // Set a breakpoint somewhere above and show the contents of numberArray
        

        // ***** CHECKPOINT 4 *****
        // Find & print the smallest number in numberArray


        //System.out.println("The minimum element is "+???);


        // ***** CHECKPOINT 5 *****
        // Find & print the percentage of numbers that is even in numberArray


        //System.out.println("The percentage of even numbers is "+???);


        // ***** CHECKPOINT 6 *****
        // Compute & print the percentage of numbers in the range -300 to 300 in numberArray


        //System.out.println(
        //  "The percentage of numbers in the range -300..300 is "+???);


        // ***** CHECKPOINT 7 *****
        // Sort the numbers in numberArray in descending order using selection sort and print them out (Example: 2, 6, 1, 10 -> 10, 6, 2, 10) 
        
        
        // ***** CHECKPOINT 8 *****
        // Print the sorted numbers in the numberArray up to 10 numbers in the numberArray per line
    }
    
    private static int getNumElements() {
        Scanner keyboard = new Scanner(System.in); // set up for keyboard input

        // prompt user for file name; read file name
        System.out.print("Number of elements: ");
        System.out.flush();
        
        return keyboard.nextInt();
    }

    private static int[] createNumberArray(int numElements) {
        Random rand = new Random();
        return rand.ints(numElements, -1000, 1001).toArray();
    }
}