import java.io.*;
import java.util.*;

public class ArrayMain {
    
    private int numElements;
    private int[] numberArray;
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
         * Importance: The following print statements provide students feeback so that the
         * students understands what the code does in the beginning before starting the lab.
         * It provides a clear understanding of what 'numberArray' and 'numElements' is used for by
         * reinforcing the idea of what 'numElements' is and how it is being used for 'numberArray'.
         * The update comments for the instructions also tells students to reuse 'numberArray'.
         * 
         * Justification: By explaining the concepts at the start, students ar emore likely to feel
         * confident in using 'numberArray' throughout the lab. The initial print statements
         * make the code easy to follow which is helpful for those learining how to use arrays
         * and understanding the concept of reusing data structures.
         */
        System.out.println("Enter a number that will be used for the size of 'numberArray'");
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
        System.out.println("Contents of 'numberArray':");
        for(int num : numberArray) {
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.println("--------------------");

        
        // ***** CHECKPOINT 2 *****
        // Compute & print the average of the numbers in numberArray
        double average = Arrays.stream(numberArray).average().orElse(0.0);
        System.out.println("The average of the numbers is "+ average);


        // ***** CHECKPOINT 3 *****
        // Set a breakpoint somewhere above and show the contents of numberArray
        

        // ***** CHECKPOINT 4 *****
        // Find & print the smallest number in numberArray
        int min = Arrays.stream(numberArray).min().orElse(1);
        System.out.println("The minimum element is "+ min);


        // ***** CHECKPOINT 5 *****
        // Find & print the percentage of numbers that is even in numberArray
        double evenPerc = 0;
        for(int num : numberArray) {
            if ((num % 2) == 0) {
                evenPerc++;
            }
        }
        evenPerc = (evenPerc / numElements) * 100; 
        System.out.println("The percentage of even numbers is "+ evenPerc + "%");


        // ***** CHECKPOINT 6 *****
        // Compute & print the percentage of numbers in the range -300 to 300 in numberArray
        double perc = 0;
        for(int num : numberArray) {
            if(num <= 300 && num >= -300) {
                perc++;
            }
        }
        perc = (perc / numElements) * 100;
        System.out.println("The percentage of numbers in the range -300..300 is "+ perc + "%");

        
        // ***** CHECKPOINT 7 *****
        // Sort the numbers in numberArray in descending order using selection sort and print them out (Example: 2, 6, 1, 10 -> 10, 6, 2, 10) 
        int n = numElements;
        for(int i = 0; i < (numElements - 1); i++) {
            int max_idx = i;
            for(int j = (i + 1); j < numElements; j++) {
                if(numberArray[j] > numberArray[max_idx]) {
                    max_idx = j;
                }
                
                int temp = numberArray[max_idx];
                numberArray[max_idx] = numberArray[i];
                numberArray[i] = temp;
            }
        }
        for(int num : numberArray) {
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.println("--------------------");
        
        
        // ***** CHECKPOINT 8 *****
        // Print the sorted numbers in the numberArray up to 10 numbers in the numberArray per line
        for(int i = 0; i < numberArray.length; i++) {
            if(((i + 1) % 10 ) == 0) {
                System.out.println(numberArray[i]);
            }
            else {
                System.out.print(numberArray[i] + " ");
            }
        }
        System.out.println("");
    }
    
    private static int getNumElements() {
        Scanner keyboard = new Scanner(System.in); // set up for keyboard input

        // prompt user for file name; read file name
        System.out.println("Number of elements: ");
        System.out.flush();
        
        return keyboard.nextInt();
    }

    private static int[] createNumberArray(int numElements) {
        Random rand = new Random();
        return rand.ints(numElements, -1000, 1001).toArray();
    }
    

}