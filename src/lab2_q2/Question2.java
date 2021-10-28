package lab2_q2;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
	static int size;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no of elements");
       Scanner scn=new Scanner(System.in);
        size=scn.nextInt();
       System.out.println("Enter the words");
       String[] a=new String[size];
       for(int i=0;i<size;i++) {
    	   a[i]=scn.next();
       }
      sortStrings(a);
     // System.out.println(Arrays.toString(a));
	}
	public static void sortStrings(String[] a) {
		  Arrays.sort(a);
		  int n=a.length;
		  if(size%2==0) {
			  for(int i=0;i<n/2;i++) {
				  a[i]=a[i].toUpperCase();
			  }
		  }else {
			  for(int i=0;i<(n/2)+1;i++) {
				  a[i]=a[i].toUpperCase();
			  }
		  }
		  System.out.println(Arrays.toString(a));
		  
	}
		
		
	

}
