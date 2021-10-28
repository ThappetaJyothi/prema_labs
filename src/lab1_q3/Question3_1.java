package lab1_q3;

import java.util.*;

public class Question3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner scn=new Scanner(System.in);
            int n=scn.nextInt();
            System.out.println( fibRecurssion(n));
	}
	private static int fibRecurssion(int n) {
		if(n==1||n==2)return 1;
		return fibRecurssion(n-1)+fibRecurssion(n-2);
		
		
	}
	
}