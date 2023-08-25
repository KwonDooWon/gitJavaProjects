package com.kh.collection;
import java.util.*;

import com.kh.io.HashSet;

public class Run {
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		
		// 컬렉션 인스턴스에 문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		// 저장된 문자열 인스턴스의 참조
		for(int i = 0; i < list.size(); i++) 
			System.out.print(list.get(i) + '\t');
		System.out.println();
		
		list.remove(0);
		
		// 첫 번째 인스턴스 삭제 후 나머지 인스턴스들을 참조
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();
		
		Set<String> set = new HashSet<>();
		set.add("Toy");   set.add("Box");
		set.add("Robot");  set.add("Box");
		System.out.println("인스턴스 수: " + set.size());
		
		for(Iterator<String> itr = set.iterator(); itr.hasNext();)
			System.out.print(itr.next() + "\t");
		System.out.println();
		
		for(String s : set)
			System.out.print(s + "\t");
		System.out.println();
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		System.out.println("23번: " + map.get(23));
		System.out.println("37번: " + map.get(37));
		System.out.println("45번: " + map.get(45));
		System.out.println();
		
		Set<Integer> ks = map.keySet();
		for(Integer n : ks)
			System.out.print(map.get(n).toString() + '\t');
	}
}
