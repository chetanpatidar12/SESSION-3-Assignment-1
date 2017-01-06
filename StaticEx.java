package com.acad.basic;

public class StaticEx {
	
		static{
		print(10);
		}
		static void print (int x) {
		System.out.println (x);
		System.exit(0); 
//option A)-Compiler Error
}
}