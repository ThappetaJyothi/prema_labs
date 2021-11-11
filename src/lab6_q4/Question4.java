package lab6_q4;
import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> st=new HashMap<>();
		st.put(101,90);
		st.put(105,100);
		st.put(104,70);
		st.put(102, 50);
		st.put(103, 80);
		System.out.println(getStudents(st));
	}
	public static HashMap<Integer,String> getStudents(HashMap<Integer,Integer> st){
		 HashMap<Integer,String> schst=new HashMap<>();
		 for(Map.Entry m:st.entrySet()) {
			 if((int)m.getValue()>=90) {
				 schst.put((int)m.getKey(),"Gold");
			 }
			 else if((int)m.getValue()>=80&&(int)m.getValue()<90) {
				 schst.put((int)m.getKey(),"Silver");
			 }
			 else if((int)m.getValue()>=70&&(int)m.getValue()<80) {
				 schst.put((int)m.getKey(),"BRONZE");
			 }
		 }
		 return schst;
	}

}
