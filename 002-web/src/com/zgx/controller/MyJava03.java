package com.zgx.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MyJava03 {
	
/*
	HashMap的使用的方法
*
*/
	public static void main(String[] args) {
		
//		1.创建HashMap
		HashMap<String, Integer> hashMap = new HashMap<>();
		
//		2.添加数据
		hashMap.put("zhangsan", 9000);
		hashMap.put("wangwu", 8800);
		hashMap.put("zhaoliu", 9700);
		
		System.out.println(hashMap);
		
//		3.判断是否存在键
		System.out.println(hashMap.containsKey("wangwu"));
		
//		4.判断是否存在值
		System.out.println(hashMap.containsValue(9000));
		
//		5.删除
		hashMap.remove("wangwu");
		System.out.println(hashMap);
		
//		6.遍历键
		Set<String> nameSet = hashMap.keySet();
		for (String string : nameSet) {
			System.out.println(string);
			System.out.println(hashMap.get(string));
		}
		
//		7.获取所有的值
		Collection<Integer> myCollection = hashMap.values();
		for (Integer integer : myCollection) {
			System.out.println(integer);
		}
		
//		8.获取所有的键值对
		Set<Entry<String, Integer>> myEntrySet = hashMap.entrySet();
		for (Entry<String, Integer> entry : myEntrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		
		
	}

}
