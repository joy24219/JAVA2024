package kr.or.ddit.study13.list;

public class ArrayExample {
	public static void main(String[] args) {
		ArrayExample obj = new ArrayExample();
		for(int i=0; i<20; i++) {
			obj.add(i);
		}
	}
	int[] array = new int[10];
	int cur = 0;
	public void add(int num) {
		if(cur == array.length) {
			int[] temp = new int[cur+10];
			for(int i=0; i<array.length; i++) {
				temp[i] = array[i];
			}
			array = temp;
		}
		array[cur++] = num;
	}
	
	public int size() {
		return cur;
	}
	
	public boolean contains(int num) {
		for (int i : array) if(num==i) return true;
		return false;
	}
	
	public void remove(int num) {
		int[] temp = new int[array.length];
		int add = 0;
		for (int i = 0; i < temp.length; i++) {
			if (i==num) add=1;
			if(i+add == temp.length-1) continue;
			temp[i] = array[i+add];
		}
	}
}
