package numberlogic;

import java.util.Scanner;

public class Armstrang
{
	int number,temp,temp1,sum,rem,count,d,add=1;
	Scanner s=new Scanner(System.in);

	void Armstrong() 
	{
		System.out.println("enter a number to check: ");
		number=s.nextInt();
		temp=number;
		d=number;
		count=(""+number).length();
		//		while(d!=0)
		//		{
		//			rem=d%10;
		//			count++;
		//			d/=10;
		//		}
		System.out.println("number of digits are = "+count);
		while(number!=0) 
		{
			rem=number%10;
			System.out.println(rem);
			for(int i=1;i<=count;i++) 
			{
				add*=rem;
				System.out.print(rem);
				if(i<=count-1) 
				{
					System.out.print("*");
				}
			}
			System.out.print("="+add);
			System.out.println();
			temp1=sum;
			sum+=add;

			System.out.println(temp1+"+"+add+"="+sum);
			number/=10;
			add=1;
		}
		if(sum==temp) 
		{
			System.out.println("given number is armstrong");
		}
		else 
		{
			System.out.println("given number is not an armstrong");
		}

	}
	public static void main(String[] args)
	{
		Armstrang a=new Armstrang();
		a.Armstrong();
	}
}
