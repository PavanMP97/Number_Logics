package numberlogic;

import java.util.Scanner;

public class NeonNumber
{
	int num,temp,mul,rem,sum;
	Scanner s=new Scanner(System.in);
	void Neon()
	{
		System.out.println("enter a number to check");
		num=s.nextInt();
		mul=num*num;
		temp=mul;
		//System.out.println(c);
		System.out.println("perfect squar of "+num+" is: "+mul);
		while(temp!=0) 
		{
			rem=temp%10;
			sum+=rem;
//			System.out.print(rem+"+ ");
			temp/=10;
		}
		if(sum==num)
		{
			System.out.println("given number is neon");
		}
		else
		{
			System.out.println("not a neon");
		}
	}
	public static void main(String[] args) 
	{
		NeonNumber n=new NeonNumber();
		n.Neon();
	}

}
