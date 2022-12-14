//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
import java.util.Scanner;
public class Prac_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,sum,sub,mult,div,mod;
		System.out.println("Enter no a:");
		a = sc.nextInt();
		System.out.println("Enter no b:");
		b = sc.nextInt();
		sum = a+b;
		System.out.println("print sum of two no :"+sum);
		sub = a-b;
		System.out.println("print the substraction of two no :"+sub);
		mult = a*b;
		System.out.println("print the multiplication of two no:"+mult);
		div = a/b;
		System.out.println("print the division of two no:"+div);
		mod = a%b;
		System.out.println("print the modulo of two number:"+mod);
		

	}

}
