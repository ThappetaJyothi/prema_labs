package lab1_q1;

import java.util.*;

public class cubenm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number to find cube");
		int n=scn.nextInt();
		cubenm c=new cubenm();
		c.cube(n);

	}
	void cube(int n)
	{
		
			int i=n*n*n;
			System.out.println(i);
	}

}
