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
    		int j=a.length-1;
    		int[] b=new int[a.length];
    		for(int i=0;i<a.length;i++) {
    			b[j]=a[i];
    			j--;
    		}
    		System.out.println(Arrays.toString(b));
    		HashSet<Integer> obj=new HashSet<>();
    		for(int i=0;i<b.length;i++) {
    			obj.add(b[i]);
    		}
    		System.out.println(obj);
    	}
	
}