package lab1_q3;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();
         int a=1;
         int b=1;
         int c;
         for(int i=0;i<=n;i++)
         {
        	 System.out.println(a);
        	 c=a+b;
        	 a=b;
        	 b=c;
         }
         

	}

}