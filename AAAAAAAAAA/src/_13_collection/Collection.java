package _13_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

public class Collection {
	/*
	 * 13장 컬렉션 프레임 워크
	 * 
	 * [컬렉션 프레임 워크]에서 가장 중요한 포인트가 있습니다. 
	 * 
	 * 1. 컬렉션 프레임워크란?
	 * 2. 컬렉션 프레임워크의 종류
	 * 3. 컬렉션 프레임쿼크 사용방법
	 * 
	 * ------------------------------------
	 * 
	 * 1. 컬렉션 프레임 워크란?
	 * 
	 *    1) 컬렉션 프레임 워크란?
	 *    
	 *       - 자료구조(Data Structure)를 사용해서 객체들을 효율적으로 관리(추가, 삭제 검색)
	 *       할 수 있도록 인터페이스와 구현 클래스를 java.util에 제공한다.
	 *       이렇게 제공된 이들을 총칭해서 컬렉션 프레임워크라고 한다.
	 *       
	 * 2. 컬렉션 프레임 워크 종류
	 * 
	 *    1) List 컬렉션 
	 *    [출석부]를 가장 먼저 떠올리세요!
	 *    - List는 순서가 있고, 순서가 있기 때문에 데이터 중복이 가능하다. 
	 *    - 배열과 비슷하게 객체를 인덱스로 관리하다.
	 *    - 배열과의 차이점은 저장 용량이 자동으로 증가하며, 객체를 저장할 때 자동 인덱스가 부여된다. 
	 *    - ArrayList, LinkedList, Vector 등이 있지만, 그중에서 [ArrayList]가 가장 대표적이다. 
	 *    
	 *    2) Set 컬렉션
	 *    
	 *    [무지개색깔 구슬이 들어있는 주머니]를 가장 먼저 떠올리세요!
	 *    - Set은 순서가 없고, 데이터 중복이 불가능하다. 그래서 하나의 null만 저장할 수 있다.
	 *    - 데이터를 Set 자체로 꺼낼 수 없고, 조력자인 Iterator를 통해서 꺼낼 수 있다. 
	 *    - HashSet, TreeSet 등이 있지만 그 중, [HashSet]이 가장 대표적이다. 
	 *    
	 *    3) Map 컬렉션
	 *    [304호 나 자신]을 가장 먼저떠올리세요!
	 *    - key,value로 구성되어있다. 
	 *    - 순서가 없고 key는 중복될 수 없고, 값은 중복될 수 잇다. 
	 *    - HashMapm HashTable, LinkedHashMap, Properties, TreeMap 등이 있지만, 구중 [HashMap]이 가장 대표적이다.
	 *    
	 * 3. 컬렉션 프레임 워크 사용 방법
	 * 
	 * 	  1) List 컬렉션
	 * 
	 *    # List 생성
	 *    List<Integer> integList           = new ArrayList<Integer>();
	 *    List<String> strList              = new ArrayList<String>();
	 *    List<Double> douList              = new ArrayList<Double>();
	 *    List<Board> boardList             = new ArrayList<Board>();
	 *    List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
	 *    
	 *    ArrayList<Integer> integList           = new ArrayList<Integer>();
	 *    ArrayList<String> strList              = new ArrayList<String>();
	 *    ArrayList<Double> douList              = new ArrayList<Double>();
	 *    ArrayList<Board> boardList             = new ArrayList<Board>();
	 *    ArrayList<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
	 *    
	 *    #List 데이터를 추가
	 *    - add(value)메소드를 이용
	 *    
	 *    #List 데이터를 수정
	 *    - set(index, value)메소드를 이용한다.
	 *    
	 *    #List 데이터를 삭제
	 *    - remove(index)메소드를 이용한다.
	 *    - remove(value)메소드를 이용한다.
	 *    
	 *    #List 데이터를 검색
	 *    - get(index)메소드를 이용한다.
	 *           
	 * */
	
	public static void main(String[] args) {
		// 문자열 타입의 데이터를 저장할 List를 생성해주세요.
		List<String> strList = new ArrayList<String>();
		
		// 생성한 List에 본인의 이름과 옆사람의 이름 2명을 추가해주세요.
		strList.add("정윤지");
		strList.add("이희진");
		strList.add("김은혜");
		System.out.println(Arrays.toString(strList.toArray()));
		
		// 추가한 해당 index의 데이터를 옆 친구의 다른 이름으로 수정해주세
		// 3명중에 index가 1인 공간의 데이터를 수정해주세요.
		strList.set(1, "유재석");
		System.out.println(Arrays.toString(strList.toArray()));
		
		// 추가한 해당 index의 데이터를 삭제해주세요 (index : 1)
		strList.remove(1);
		System.out.println(Arrays.toString(strList.toArray()));
		
		// index 0번째의 데이터를 조회해주세요.
		String nameString = strList.get(0);
		System.out.println("0번째 학생의 이름은 :"+nameString);
		
		/*
		 * 2)Set 컬랙션
		 * 
		 *    # Set 생성
		 *    Set<Integer> integSet           = new HashSet<Integer>();
		 *    Set<String> strSet              = new HashSet<String>();
		 *    Set<Double> douSet              = new HashSet<Double>();
		 *    Set<Board> boardSet             = new HashSet<Board>();
		 *    Set<Map<String, String>> mapSet = new HashSet<Map<String, String>>();
		 *    
		 *    HashSet<Integer> integSet           = new HashSet<Integer>();
		 *    HashSet<String> strSet              = new HashSet<String>();
		 *    HashSet<Double> douSet              = new HashSet<Double>();
		 *    HashSet<Board> boardSet             = new HashSet<Board>();
		 *    HashSet<Map<String, String>> mapSet = new HashSet<Map<String, String>>();
		 * 
		 *    #Set 추가
		 *    - add(value) 메소드를 이용한다.
		 *    
		 *    #Set 수정
		 *    - 수정이 존재하지 않는다. 
		 *    
		 *    #Set 삭제
		 *    - remove(value) 메소드를 이용한다.
		 *    
		 *    #Set 검색(조회)
		 *    - iterator() 메소드를 이용해서 데이터를 꺼낼 수 있도록 조력자한테 도움을 요청한다.
		 *    - hasNext() 메소드를 이용해 Set 안에 데이터가 있는지 확인한다. 
		 *    - next() 메소드를 이용해서 Set안에 데이터를 꺼낸다.
		 * 
		 * */
		//문자열 타입의 데이터를 저장할 Set을 생성해주세요.
		Set<String> set = new HashSet<String>();
		
		//생성한 Set에 본인의 이름과 옆사람 2명의 이름을 추가해주세요.
		set.add("정윤지");
		set.add("이희진");
		set.add("김은혜");
		System.out.println("Set 생성후 총 3명의 학생 추가 :"+Arrays.toString(set.toArray()));
		
		// 추가한 해당 index의 데이터를 옆 친구 이름으로 수정해주세요. 
		// ## Set은 수정메소드가 존재하지 않음. 
		
		// 추가한 학생 중, 한명을 삭제해주세요.
		// 3명중 가운데에 있는 학생을 삭제해주세여.
		set.remove("이희진");
		System.out.println("Set 생성후 가운데 학생 삭제 :"+Arrays.toString(set.toArray()));
		
		// 모든 학생의 이름을 조회
		Iterator<String> ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println("Set에 담긴 학생 정보 조회 :"+ite.next());
		}
		
		/*
		 *  3) Map 컬렉션
		 *  
		 *  	#Map 생성
		 *  	
		 *  	Map<String, String> map = new HashMap<String, String>();
		 *  	Map<Integer, String> map = new HashMap<Integer, String>();
		 *  	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		 *  	Map<String, Board> map = new HashMap<String, Board>();
		 *  	Map<String, List<board>> map = new HashMap<String, List<board>>();
		 *  
		 *  	HashMap<String, String> map = new HashMap<String, String>();
		 *  	HashMap<Integer, String> map = new HashMap<Integer, String>();
		 *  	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		 *  	HashMap<String, Board> map = new HashMap<String, Board>();
		 *  	HashMap<String, List<board>> map = new HashMap<String, List<board>>();
		 * 
		 * 		#Map 추가
		 * 		- put(key, value) 메소드를 이용한다. 
		 * 
		 * 		#Map 수정
		 * 		- put(key, value) 메소드를 이용해서 key들 중, 수정할 key를 선택해서 수정. 
		 * 
		 * 		#Map 삭제
		 * 		- remove(value) 메소드를 이용한다. 
		 * 
		 * 		#Map 조회
		 * 		- get(key) 메소드를 이용한다.
		 
		 * 
		 * */
		// 문자열 타입의 데이터를 저장할 Map을 생성해주세요. (key: 문자열, value: 문자열)
		Map<String, String> map = new HashMap<String, String>();
		
		// 생성한 Map에 본인의 이름과 옆사람 2명의 이름을 추가해주세요.
		map.put("stu1","정윤지");
		map.put("stu2","이희진");
		map.put("stu3","김은혜");
		
		// 두번째 학생의 이름을 수정해주세요.
		map.put("stu2","유재석");
		
		// 세번째 학생의 삭제해주세요.
		map.remove("stu3");
		
		// map에 저장되어있는 학생모두를 출력해주세요.
		System.out.println("첫번째 학생 : "+map.get("stu1"));
		System.out.println("두번째 학생 : "+map.get("stu2"));
		System.out.println("세번째 학생 : "+map.get("stu3"));
		
		Set<String> keySet= map.keySet();
		Iterator<String> ite1 =keySet.iterator();
		while (ite1.hasNext()) {
			String key = (String) ite1.next();
			System.out.println("Map에서 KeySet()을 이용하는 방법 : "+map.get(key));
		}
		
		Set<Entry<String,String>> entrySet = map.entrySet();
		Iterator<Entry<String,String>> entryIte = entrySet.iterator();
		while (entryIte.hasNext()) {
			Entry<String, String> entry = entryIte.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Map에서 entrySet()을 이용하는 방법");
			System.out.println("[key]" + key);
			System.out.println("[value]" + value);
		}
		while (entryIte.hasNext()) {
			Map.Entry<java.lang.String, java.lang.String> entry = (Map.Entry<java.lang.String, java.lang.String>) entryIte.next();
			
		}
	}
}
