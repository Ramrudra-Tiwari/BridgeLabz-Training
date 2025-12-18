import java.util.Scanner ;
public class MultiplicationTable{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// Taking user input of number
		int num = Sc.nextInt();

		// Checking the condition 9<=num>=6
		if(num>5 && num<10){
			for(int i = 1 ; i<11 ; i++){
				System.out.println(num + " * " + i + " = " +  (num*i));
			}
		}
		

	}
}	
