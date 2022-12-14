/*Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/
import java.util.Scanner;
public class Prac_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,num1;
		System.out.println("Enter no:");
		num1 = sc.nextInt();
		for(i=0;i<10;i++) {
			System.out.println(num1 + " x " + (i+1) + " = " + 
				     (num1 * (i+1)));
			
		}
		
	}

}
