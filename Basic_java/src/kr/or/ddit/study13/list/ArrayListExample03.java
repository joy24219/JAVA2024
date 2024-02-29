package kr.or.ddit.study13.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample03 {
	public static void main(String[] args) {
		Student s1 = new Student("n1","10");
		Student s2 = new Student("n2","11");
		Student s3 = new Student("n3","12");
		
		List<Student> l = new ArrayList();
		l.add(s1);
		l.add(s2);
		l.add(s3);

		for (int i=0; i<l.size(); i++) {
			Student stu = l.get(i);
			if(stu.name.equals("n2")) {
				System.out.println("나이는 "+stu.age);
			}
		}
		
		Student sremove = l.remove(1);
		System.out.println(sremove.name+", "+sremove.age);
		
		for (int i = 0; i < l.size(); i++) { 
			Student stu = l.get(i);
			System.out.println(stu.name+" "+stu.age);
		}
		
	}
}

class Student{
	String name;
	String age;
	public Student(String name, String age) {
		this.name = name;
		this.age = age;
	}
}