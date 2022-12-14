import java.util.Scanner;
public class prac1 {
	  static int sub(int a,int b,int c ){
	    int smallest;
	    if(a<b && a<c){
	      smallest=a;
	      System.out.println("smallest value is :"+smallest);
	    }
	    else if(b<c){
	      smallest=b;
	      System.out.println("smallest value is :"+smallest);
	    }
	    else{
	      smallest=c;
	      System.out.println("smallest value is:"+smallest);
	    }
	    return smallest;
	  }
	public static void main(String[] args) {
		    Scanner sc =new Scanner(System.in);
		    int First,Second,Third;
		    System.out.println("Enput the first number:");
		    First=sc.nextInt();
		      System.out.println("Enput the second number:");
		      Second =sc.nextInt();
		        System.out.println("Enput the third number:");
		        Third =sc.nextInt();
		    
		  }
		

	}


