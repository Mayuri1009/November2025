package javaProgramSession;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=sc.nextLine();
		
		System.out.println("Entered no is"+"="+name);
		
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		System.out.println("Entered age is"+"="+age);
		

	}

}
