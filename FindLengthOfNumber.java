package numberlogic;

import java.util.Scanner;

public class FindLengthOfNumber {

	public static void main(String[] args) {
		System.out.println("enter the number to find length");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt(),temp=num;
		int rem=0,count=0;
		while(num!=0)
			{
				rem=num%10;
				count++;
				num/=10;
			}
		System.out.println(count);
//-------------------------------- OR ------------------------------------
		System.out.println("-------------------OR----------------------");
		int number=(""+temp).length();
		System.out.println(number);
	}

}
