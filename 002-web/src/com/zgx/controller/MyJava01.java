package com.zgx.controller;

import com.zgx.bean.User;

public class MyJava01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Alt + shift + M 
		m01();
		m02();
		m03();
//		Alt + shift + L
		User user = new User();
		user.toString();
		
	}

	private static void m03() {
		boolean bb = false;
		if (bb) {
			System.out.println("正确");
		}else {
			System.out.println("错误");
		}
	}

	private static void m02() {
		String a = "xxx";
		System.out.println(a);
	}

	private static void m01() {
		int c = 10;
		System.out.println(c);
	}

}
