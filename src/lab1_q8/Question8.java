package lab1_q8;

import  java.util.*;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int m=scn.nextInt();
		if(checkNumber(m))
		{
			System.out.println(m+"     it is  a base of 2");
		}
		else {
			System.out.println(m+"  not base of 2");
		}
		

	}
	static boolean checkNumber(int num)
	{
	 int n=num;
	 int rem=0;
	 while(n>1)
	 {
		 rem=n%2;
		n/=2;
	 }
	 if(rem==0)return true;
	 return false;
	}
}
