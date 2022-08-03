package numberlogic;

import java.util.Scanner;

public class Perfect_Square 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int num=scan.nextInt();
		int sqr=1,temp=1;

		for(int i=1;i<=100;i++) 
		{
			sqr=i;
			temp=sqr*i;
			System.out.println("sqr of "+i+" is: "+temp);
		}
	}

}
