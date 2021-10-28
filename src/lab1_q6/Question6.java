package lab1_q6;

import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the range to find diffeerence");
		int m=scn.nextInt();
		 int s=calculateDifference(m);
		 System.out.println("Difference of sum of square of number"+" "+ s);
}
	static int  calculateDifference(int end)
	{
		int n=end;
		int sum1=0;
		int sum=0;
		int sum2=0;
		for(int i=0;i<=n;i++)
		{
			sum1=sum1+(i*i);
		}
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		sum2=sum*sum;
		return sum1-sum2;
	}

}