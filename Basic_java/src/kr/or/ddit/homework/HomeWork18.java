package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class HomeWork18 {
	public static void main(String[] args) {
		HomeWork18 hw = new HomeWork18();
		hw.process();
	}
	
	public void process() {
		List<Map> list = dataInput();
		
		//1. 제일 높은 월급 구하기.
		int max = maxSalary(list);
		System.out.println("제일 높은 월급 : "+max);
		
		//2. 각 부서별 월급 총합 구하기
		System.out.println(getDeptSalSum(list));
		
		//3. enmno를 파라미터로 모든 정보 출력하는 메소드 만들기.
		printAll(7369);
		
	}
	
	public void printAll(int empno) {
		List<Map> list = dataInput();
		for (int i = 0; i < list.size(); i++) {
		    Map m = list.get(i);
			if(m.containsValue(empno)) {
				Set<String> set = m.keySet();
				Iterator<String> it = set.iterator();
				while(it.hasNext()){
					String key = it.next();
					System.out.println(key+" : "+m.get(key));
				}
			}
		}	
	}	
	public Map<String, Integer> getDeptSalSum(List<Map> list){

		Map<String, Integer> salSum = new HashMap();

		for (int i = 0; i < list.size(); i++) {
		    Map m = list.get(i);
		    String dept = (String) m.get("DNAME");
		    int sal = (int) m.get("SAL");
		   
		    if(salSum.containsKey(dept)) { 
		    	sal += salSum.get(dept);
		    }
		    salSum.put(dept, sal);
		}
		return salSum;
	}
	public int maxSalary(List<Map> list) {
		int max = 0;
//		for(Map m:list) {
//			int sal = (int)m.get("SAl");
//			if(sal>max) max = sal;
// 		}
		for (int i = 0; i < list.size(); i++) {
		    Map m = list.get(i);
		    int sal = (int) m.get("SAL");
		    if(sal>max) max = sal;
		}
		return max;
	}
	public List<Map> dataInput(){
		List<Map> list = new ArrayList();
		
//		7369	장길동	프로그래머	650	조사부
		Map<String, Object> map1 = new HashMap();
		map1.put("EMPNO",7369);
		map1.put("ENAME","장길동");
		map1.put("JOB","프로그래머");
		map1.put("SAL",650);
		map1.put("DNAME","조사부");
		
//		7499	고영우	영업사원	340	영업부
		Map<String, Object> map2 = new HashMap();
		map2.put("EMPNO",7499);
		map2.put("ENAME","고영우");
		map2.put("JOB","영업사원");
		map2.put("SAL",340);
		map2.put("DNAME","영업부");
		
//		7566	김동혁	관리자		295	관리부
		Map<String, Object> map3 = new HashMap();
		map3.put("EMPNO",7566);
		map3.put("ENAME","김동혁");
		map3.put("JOB","관리자");
		map3.put("SAL",295);
		map3.put("DNAME","관리부");
		
//		7654	김민욱	영업사원	950	영업부
		Map<String, Object> map4 = new HashMap();
		map4.put("EMPNO",7654);
		map4.put("ENAME","김민욱");
		map4.put("JOB","영업사원");
		map4.put("SAL",950);
		map4.put("DNAME","영업부");
		
//		7698	김민정	관리자		450	관리부
		Map<String, Object> map5 = new HashMap();
		map5.put("EMPNO",7698);
		map5.put("ENAME","김민정");
		map5.put("JOB","관리자");
		map5.put("SAL",450);
		map5.put("DNAME","관리부");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		
		return list;
	}
}
