package kr.or.ddit.study13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashMap
 * 	- key와 value로 이루어짐
 *  - key값은 중복을 허용하지 않고 순서가 보장되지 않음
 *  
 * MAP 타입의 대표 컬렉션
 * 
 * 주요메소드
 * .put(key, value) : 데이터 입력 key 값은 중복되지 않음. value는 중복가능
 * .get(key)        : 입력 받은 값을 key 값을 통해 꺼내 올수 있음.
 * .clear()         : 데이터 초기화
 * .keySet()        : key값을 Set타입으로 전부 가져옴.
 * 
 *
 */
public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		//<String, Integer> -> 제네릭(Generics)
		
		map.put("홍길동", 95);
		map.put("이순신", 85);
		map.put("강감찬", 87);
		map.put("강감찬", 100); // map에 같은 값을 넣게 되면 덮어서 넣게됨.
		
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.println(key+" : "+map.get(key));
		}
	}
}
