package numberlogic;

import java.util.Scanner;

public class Sum_Of_Even_And_Odd 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int rem=0;
		int even=0;
		int c=0;
		int odd=0;
		while(num!=0) 
		{
			rem=num%10;
			c++;
			num/=10;
			if(rem%2==0) 
			{
				even+=rem;
			}
			else 
			{
				odd+=rem;
			}
		}
		System.out.println("length of given number is: "+c);
		System.out.println("sum of even number in given number: "+even);
		System.out.println("sum of odd number in given number: "+odd);
	}

}
