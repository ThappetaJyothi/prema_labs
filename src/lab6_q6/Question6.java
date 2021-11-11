package lab6_q6;
import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> pl=new HashMap<>();
		pl.put(101,1999);
		pl.put(103,1989);
		pl.put(102,2019);
		pl.put(106,1989);
		pl.put(104,2009);
		pl.put(105,2004);
		
		System.out.println(voterslist(pl));

	}
	public static List<Integer> voterslist(HashMap<Integer,Integer> pl){
		List<Integer> li=new ArrayList<>();
		for(Map.Entry m:pl.entrySet()) {
			int age=2024-(int)m.getValue();
			if(age>18) {
				li.add((int)m.getKey());
			}
		}
		return li;
	}

}
