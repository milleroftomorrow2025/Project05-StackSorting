import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;

/**
 * SortedStackApp
 * 
 * <p>This program reads a list of integer numbers from standard input,
 * stores them into a Stack, sorts the numbers from smallest to largest,
 * and then prints the sorted Stack. This update is a maintenance task
 * adapting the previous LinkedList-based solution (Project #4) to now use a Stack.
 * The program is designed to be run from the command line without the need for an IDE.</p>
 * 
 * <p>Command-line instructions:
 * <br>To compile: javac SortedStackApp.java
 * <br>To run: java SortedStackApp
 * <br>To generate Javadoc: javadoc -d doc SortedStackApp.java
 * </p>
 * 
 * @author Andrew Miller
 * @version 1.0
 * @since 17 February 2025
 */
public class SortedStackApp {

    /**
     * The main method reads integers from standard input, stores them in a Stack,
     * sorts the Stack using the Collections Framework, and prints the sorted Stack.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a Scanner to read from standard input
        Scanner scanner = new Scanner(System.in);
        
        // Create a Stack to store integer values
        Stack<Integer> numbersStack = new Stack<>();
        
        // Prompt the user for input
        System.out.println("Enter integer numbers separated by whitespace.");
        System.out.println("Input a non-integer to finish:");
        
        // Read input tokens until a non-integer is encountered
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                // Push the integer onto the Stack
                numbersStack.push(number);
            } else {
                break;
            }
        }
        
        // Close the scanner to free resources
        scanner.close();
        
        // Sort the Stack in ascending order using Collections Framework
        Collections.sort(numbersStack);
        
        // Print the sorted Stack
        System.out.println("Sorted Stack (from smallest to largest): " + numbersStack);
    }
}
