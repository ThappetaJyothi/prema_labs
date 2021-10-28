package lab1_q4;

import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter range");
		int start=scn.nextInt();
		int end=scn.nextInt();
		for(int n=start;n<=end;n++)
		{
			if(n<=1)
			{
				continue;
			}
			boolean flag=true;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			System.out.println(n);
		}

	}

}
