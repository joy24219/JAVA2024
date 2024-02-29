package kr.or.ddit.study13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		// emp_no, emp_name, dept, tel을 키값으로
		// 100	 , 홍길동  , 영업부, 010-1234-5678를 넣어보기
		
//		Map<String, String> EMP = new HashMap();
//		
//		EMP.put("emp_no","100");
//		EMP.put("emp_name","홍길동");
//		EMP.put("dept","영업부");
//		EMP.put("tel","010-1234-5678");	
//
//		Set<String> set = EMP.keySet();
//		Iterator<String> it = set.iterator();
//		// emp_no 꺼내기
//		
//				
//		// tel 꺼내기
//		
//		// 전체값 꺼내서 출력하기.
//		while(it.hasNext()){
//			String key = it.next();
//			System.out.println(key+" : "+EMP.get(key));
//		}
		
		
		
		Map<String, Object> map = new HashMap();
		
		map.put("emp_no",100);
		map.put("emp_name","홍길동");
		map.put("dept","영업부");
		map.put("tel","010-1234-5678");

		
		// emp_no 꺼내기
		int emp_no = (int) map.get("emp_no");
		
		// tel 꺼내기
		String tel = (String) map.get("tel");
		
		// 전체값 꺼내서 출력하기.
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.println(key+" : "+map.get(key));
		}
		
		
	}
}
//public class MapExample {
//	public static void main(String[] args) {
//		Map<String, Integer> map = new HashMap();
//		//<String, Integer> -> 제네릭(Generics)
//		
//		map.put("홍길동", 95);
//		map.put("이순신", 85);
//		map.put("강감찬", 87);
//		map.put("강감찬", 100); // map에 같은 값을 넣게 되면 덮어서 넣게됨.
//		
//		
//		Set<String> set = map.keySet();
//		Iterator<String> it = set.iterator();
//		while(it.hasNext()){
//			String key = it.next();
//			System.out.println(key+" : "+map.get(key));
//		}
//	}
//}