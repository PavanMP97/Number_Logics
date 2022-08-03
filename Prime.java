package numberlogic;

import java.util.Scanner;

class Prime 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int  num =scan.nextInt(),count=0;
		if(num==0||num==1)
		{
			System.out.println(num+" not a Prime Number");	
		}
		else
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0) 
				{
					count++;
				}

			}
			if(count==2) 
			{
				System.out.println(num+" is Prime Number");	
			}
			else
			{
				System.out.println(num+" is Not a Prime Number");
			}
		}

	}

}
