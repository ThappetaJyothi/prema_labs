package lab3_q4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
  
    public class Question4 {
    	     
    	public static void main(String[] args) {
    		
    		Scanner scn =new Scanner(System.in);
    		System.out.println("Emter the size");
    		int n=scn.nextInt();
    		int[] a=new int[n];
    		System.out.println("Enter the elements");
    		for(int i=0;i<n;i++) {
    			a[i]=scn.nextInt();
    		}
    		modifyArray(a);
//    		System.out.println(Arrays.toString(c));

    	}
    	public static void modifyArray(int[] a) {
    		Arrays.sort(a);
    		int[] b=new int[a.length];
    		for(int i=a.length-1;i>=0;i--) {
    			b[i]=a[i];
    		}
    		
    		
    	 System.out.println(Arrays.toString(b));;
    	}
    	
	
}