package lab3_q3;

import java.util.*;

public class Question3 {
	public static void main(String[] args) {
	     Scanner scn=new Scanner(System.in);
		System.out.println("Enter the range");
		int n=scn.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++) {
			a[i]=scn.nextInt();
		}
	int[] c=getSorted(a);
	System.out.println("sorted : "+Arrays.toString(c));
	}
	public static int[] getSorted(int[] a)
	{   for(int i=0;i<a.length;i++) {
		int b=a[i];
		int rev=0;
			while(b!=0) {
				rev=rev*10+b%10;
				b=b/10;
			}
			a[i]=rev;
		}
		System.out.println("Reverse "+Arrays.toString(a));
		Arrays.sort(a);
	//	System.out.println(Arrays.toString(a)+" *");
		return a;
	}
}