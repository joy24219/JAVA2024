package kr.or.ddit.study13.list;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList
 *	- 1차원 배열구조
 *  - 중복을 허용하고 순서화 제공
 *  - List 타입의 컬렉션
 *  
 * 주요메소드
 * 	.add      : 데이터 삽입
 *  .claer    : 모든 데이터 삭제
 *  .contains : 포함 여부 확인
 *  .get      : idx 자료 반환
 *  .remove   : idx 자료 반환 후 삭제
 *
 */

public class ArrayListExample {
	public static void main(String[] args) {
		List l = new ArrayList();
		for(int i=0; i<10; i++) {
			l.add("회원"+i);
		}
		for(int i=0; i<10; i++) {
			l.add(i);
		}
		for(int i=0; i<10; i++) {
			l.add(i+0.5);
		}
		//String, int ,double 다 입력가능
		for (int i = 0; i < l.size(); i++) { //size() 가 마지막 입력 배열값
			System.out.println(l.get(i));
		}
		
		String a = "a0";
		
		if(l.contains(a)) {
			System.out.println(a+"값이 포함되어 있음");
		}
		
		// 값을 받을때는 배열에 여러가지 형태의 타입으로 바꿨기 때문에 object 타입이라 타입변환이 필요
		
		String result = (String)l.remove(0);
		System.out.println(result);
	}
}
