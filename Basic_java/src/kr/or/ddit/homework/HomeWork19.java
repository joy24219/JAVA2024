package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeWork19 {
	public static void main(String[] args) {
		HomeWork19 hw = new HomeWork19();
		hw.process();
	}
	
	public void process() {
		List<Map> list = dataInput();
		// 전체 출력하기
		printAll(list);
		
		// 차량번호를 입력하면 시간 계산
		int min = getMin(list, "0000");
		
		// 차량 시간별 요금 계산 
		int pay = pay(min);
		System.out.println("\n사용시간은 "+(min/60)+"시간 "+(min%60)+"분이며 금액은 "+pay+"원 입니다.");
		
	}
	
	public int pay(int min) {
//		기본 시간(분)	기본 요금(원)	단위 시간(분)	단위 요금(원)
//				  180			5000			  10		    600
		if(min<=180) {return 5000;}
		else {
			min=min-180;
			if(min%10 != 0) return (min/10)*600+5600;
			return (min/10)*600+5000;
		}
	}
	
	public int getMin(List<Map> list, String carNum) {
		int time = 0;
		Map<String,String> temp = new HashMap();
		
		for(int i=0; i<list.size(); i++) {
			Map map = list.get(i);
			
			String T =(String) map.get("시각");
			String C =(String) map.get("내역");
			
			if(map.containsValue(carNum)) {
				if(C.equals("입차")) {
					temp.put("시각", T);
				}else if(C.equals("출차")){
					String t =(String)temp.get("시각");
					time += getTime(T)-getTime(t);
				}
			}
		}
		return time;

	}
	
	private String parseInt(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getTime(String time) {
		//07:59
		String hours = time.split(":")[0];
		String mins = time.split(":")[1];
		return Integer.parseInt(hours)*60+Integer.parseInt(mins);
	}
	
	public void printAll(List<Map> list) {
		for(Map map : list){
	    	System.out.print("시각:"+map.get("시각"));
	    	System.out.print("\t차량번호:"+map.get("차량번호"));
	    	System.out.print("\t내역:"+map.get("내역"));
	    	System.out.println();
	    }
	}
	
	public List<Map> dataInput(){
//		시각   차량번호  내역
//		05:34	5961	 입차
//		06:00	0000	 입차
//		06:34	0000	 출차
//		07:59	5961	 출차
//		07:59	0148	 입차
//		18:59	0000	 입차
//		19:09	0148	 출차
//		22:59	5961	 입차
//		23:00	5961	 출차
//		23:59	0000	 출차
		List<Map> list = new ArrayList();
		Map<String,String> map1 = new HashMap();
		map1.put("시각","05:34");
		map1.put("차량번호","5961");
		map1.put("내역","입차");
		
		Map<String,String> map2 = new HashMap();
		map2.put("시각","06:00");
		map2.put("차량번호","0000");
		map2.put("내역","입차");
		
		Map<String,String> map3 = new HashMap();
		map3.put("시각","06:34");
		map3.put("차량번호","0000");
		map3.put("내역","출차");
		
		Map<String,String> map4 = new HashMap();
		map4.put("시각","07:59");
		map4.put("차량번호","5961");
		map4.put("내역","출차");

		
		Map<String,String> map5 = new HashMap();
		map5.put("시각","07:59");
		map5.put("차량번호","0148");
		map5.put("내역","입차");

		
		Map<String,String> map6 = new HashMap();
		map6.put("시각","18:59");
		map6.put("차량번호","0000");
		map6.put("내역","입차");

		
		Map<String,String> map7 = new HashMap();
		map7.put("시각","19:09");
		map7.put("차량번호","0148");
		map7.put("내역","출차");
		
		Map<String,String> map8 = new HashMap();
		map8.put("시각","22:59");
		map8.put("차량번호","5961");
		map8.put("내역","입차");
		
		Map<String,String> map9 = new HashMap();
		map9.put("시각","23:00");
		map9.put("차량번호","5961");
		map9.put("내역","출차");

		Map<String,String> map10 = new HashMap();
		map10.put("시각","23:59");
		map10.put("차량번호","0000");
		map10.put("내역","출차");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		list.add(map6);
		list.add(map7);
		list.add(map8);
		list.add(map9);
		list.add(map10);
		
		return list;
	}
}
