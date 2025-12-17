// Writing java program for calculating average marks of Sam


public class SamAverageMarks{
	public static void main(String[] args){
	// Create int variables to assign value maths, physics, chemistry marks;
	int mathsMarks = 94, physicsMarks = 95, chemistryMarks = 96;

	// Create a int variable averageMarks and calculating the value of Sam’s average mark
	double averageMarks = (double)(mathsMarks+physicsMarks+chemistryMarks)/3;

	// Display the result
	System.out.println (" Sam’s average mark in PCM is " + averageMarks);
}


}