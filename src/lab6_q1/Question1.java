package lab6_q1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the values ");
		int n=scn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scn.nextInt();
		}
		TreeMap<Integer,Integer> map=new TreeMap<>();
		for(int i=0;i<n;i++) {
			map.put(i,a[i]);
		}
		System.out.println(getelements(map));
	}
	public static List<Integer> getelements(TreeMap<Integer,Integer> map){
		List<Integer> li=new ArrayList<>();
		for(Map.Entry m:map.entrySet()) {
			li.add((Integer) m.getValue());
		}
		return li;
		
	}

}
