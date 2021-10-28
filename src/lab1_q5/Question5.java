package lab1_q5;

import java.util.*;

public class Question5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the range to find sum");
		int m=scn.nextInt();
		 int s=calculateSum(m);
		 System.out.println("The of numbers which is divisibble by 3or 5 is"+s);
		 

	}
	public static int calculateSum(int end)
	{
		int e=end;
		int sum=0;
		for(int n=0;n<=e;n++)
		{
			if(n%3==0||n%5==0)
			{
				sum=sum+n;
			}
		}
		return sum;
	}

}
