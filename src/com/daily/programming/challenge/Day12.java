package com.daily.programming.challenge;
import java.util.*;
public class Day12 {
	public static boolean isValid(String str) {
		Stack<Character> s=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			
			if(ch=='('||ch=='{'||ch=='[') {
				s.push(ch);
			}else {
				if(s.isEmpty()) {
					return false;
				}
				if(s.peek()=='('&&ch==')'||s.peek()=='{'&&ch=='}'||s.peek()=='['&&ch==']') {
					s.pop();
				}else {
					return false;
				}
			}
		}
		if(s.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String args[]) {
		String str= "()";
		System.out.println("The parenthesis "+str+" is : "+isValid(str));
		String str1= "([)]";
		System.out.println("The parenthesis "+str1+" is : "+isValid(str1));
		String str2="[{()}]";
		System.out.println("The parenthesis"+str2+" is : "+isValid(str2));
		String str3="";
		System.out.println("The parenthesis"+str3+" is : "+isValid(str3));
		
	}

}
