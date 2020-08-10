package com.demo;

import java.util.Date;

public class CaseConverter {
	
	public String convertCase(String data) {
		String temp = "";
		System.out.println("Inside convertCase()...!");
		if(data == null)
			return "";
		else if(data.length() == 0)
			return "";
		else if(data.length() == 1 && isNumber(data))
			return data;
		else {
			for(int i=0;i<data.length();i++) {
				int x = data.charAt(i);
				x -= 32;
				temp = temp + (char) x;
			}
			return temp;
		}
	}
	
	private boolean isNumber(String str) {
		int x = str.charAt(0);
		if(x > 47 && x < 58)
			return true;
		
		return false;
	}
	
	public static void main(String a[]) {
		System.out.println("Hello! " + new Date());
	}

}
