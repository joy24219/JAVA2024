package kr.or.ddit.study13.list;

import java.util.ArrayList;
import java.util.List;

public class ArryListExample02 {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add("a");
		l1.add(1); // int는 바로 못들어가고 intger로 들어감
		l1.add(10.5);
		
		//String s1 = l1.get(0); //이렇게 대입시 오류발생
		String s1 = (String) l1.get(0);
		
		List<String> l2 = new ArrayList();
		l2.add("a1");
		l2.add("a2");
		l2.add("a3");
		//l1.add(3); //타입과 다른 값으로 애러발생
		
		String s2 = l2.get(0); // l2는 스트링만 입력한다는 선언하여서 타입선언없이 가능
		
	}
}
