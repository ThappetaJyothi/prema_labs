package lab1_q2;

import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the light which is on traffic signal");
		
		String s1=scn.next();
		int choice=0;
		if(s1.equalsIgnoreCase("red"))
		{
			choice=1;
		}
		else if(s1.equalsIgnoreCase("yellow"))
		{
			choice=2;
		}
		else if(s1.equalsIgnoreCase("green"))
		{
			choice=3;
		}
		switch(choice)
		{
		case 1:System.out.println("STOP");break;
		case 2:System.out.println("READY");break;
		case 3:System.out.println("GO");break;
		default :System.out.println("invalid");
		}
		{
		
		}
		

	}

}
