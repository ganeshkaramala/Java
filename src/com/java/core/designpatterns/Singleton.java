package com.java.core.designpatterns;

public class Singleton {

	private static Singleton obj;

	public static Singleton getInstance() {
		if (obj == null) {
			obj = new Singleton();
		}
		return obj;
	}
}
