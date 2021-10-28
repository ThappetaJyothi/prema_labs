package lab2_q1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of elements");
		Scanner scn=new Scanner(System.in);
		int size=scn.nextInt();
		System.out.println("Enter the elements");
		int[] a=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=scn.nextInt();
		}
		System.out.println( getSecondSmallest(a));

	}
	public static int getSecondSmallest(int[] a) {
		int min1=a[0];
		int min2=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min1) {
				min2=min1;
				min1=a[i];
			}else if(min1==min2||a[i]<min2) {
				min2=a[i];
			}
		}
		return min2;
	}

}
