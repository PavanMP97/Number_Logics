package numberlogic;

import java.util.Scanner;

class Power
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the base value: ");
		int base=s.nextInt();
		int temp=base;
		System.out.println("enter the power value :");
		int power=s.nextInt();
		for(int i=1;i<power;i++) 
		{

			base*=temp;
		}
		System.out.println(base);
	}

}
