package week8;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAPP {
    
	// This program creates two randomized queues.
	
	public static void main(String[] args) {
    	// Tell the user what the program does:
		System.out.println("This program creates two randomized queues.");
		
		// Create the two queues:
		Queue<String> line1 = new LinkedList<>();
		Queue<String> line2 = new LinkedList<>();
		
		// Declare variables used:
    	char let1 = 'A';
    	char let2 = 'A';
    	int time = 0;
    	int rn;
    	
    	// Create a "person" and add one to both queue lines to start:
    	String person1 = "" + let1 + let1 + let1;
    	String person2 = "" + let2 + let2 + let2;
    	line1.add(person1);
    	line2.add(person2);
    	
    	// Print the initial queues:
    	System.out.println("\nInitial Queues");
		System.out.println("Line 1: " + line1);
		System.out.println("Line 2: " + line2);
    	
    	// Run the queues:
    	while (time < 39)
    	{	
    		// Add a person to the first queue if the random number is one, and add a person to the
    		// second queue if the random number is two, and add a person to both if the random number is three.
    		// Remove a person from the first queue if the number is four, and remove a person from the second queue if
    		// the number is five.
    		// Also, if the size of either of the queues surpasses 20, a person will be removed.
    		rn = (int)(Math.random() * 6);
    		if (rn == 1) {let1++; person1 = "" + let1 + let1 + let1; line1.add(person1);}
    		if (rn == 2) {let2++; person2 = "" + let2 + let2 + let2; line2.add(person2);}
    		if (rn == 3) {
    			let1++; person1 = "" + let1 + let1 + let1; line1.add(person1);
    			let2++; person2 = "" + let2 + let2 + let2; line2.add(person2);}
    		if ((rn == 4) || (line1.size() > 20)) {line1.poll();}
    		if ((rn == 5) || (line2.size() > 20)) {line2.poll();}
    		
    		// Print the results:
    		System.out.println("\nTime " + (time + 1));
    		System.out.println("Line 1: " + line1);
    		System.out.println("Line 2: " + line2);
    		time ++;
    		
    	}
    	
    	// Tell the user the program has ended:
    	System.out.println("\nProgram ended.");

    }
}