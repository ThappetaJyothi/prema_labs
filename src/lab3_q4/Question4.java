package lab3_q4;

import java.util.Arrays;

import java.util.Scanner;
import java.util.*;
  
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
    		
    		Set<Integer> obj=new LinkedHashSet<>();
    		for(int i=a.length-1;i>=0;i--) {
    			obj.add(a[i]);
    		}
    		System.out.println(obj);
    		Object[] c=obj.toArray();
//    		for(int i=c.length-1;i>=0;i--) {
//    			System.out.println(c[i]);
//    			
//    		}
                  
    	}
	
}