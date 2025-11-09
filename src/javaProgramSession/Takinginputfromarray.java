package javaProgramSession;

import java.util.Scanner;

public class Takinginputfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner sc=new Scanner(System.in);
		
		
		int[] arr=new int[10];
		System.out.print("Enter how many numbers: ");
        int size = sc.nextInt();  // size of array
		
		System.out.println("Enter " + 10 + " numbers:");
        for (int i = 0; i < 10; i++) {
           arr[i] = sc.nextInt(); // read number
        }

        // Output: display array elements
        System.out.println("You entered:");
        for (int num : arr) {
            System.out.println(num);
        }

        sc.close();
    }
	}


