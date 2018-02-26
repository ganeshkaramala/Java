package com.java.core;


/*
 * Java is always pass-by-value. Primitive data types and object reference are just values
 * 
 * Java manipulates objects by reference, and all object variables are references. 
 * However, Java doesn't pass method arguments by reference, but by value.
 * 
 * 
 * 
 * 
 */
class Apple {
	
	private String color = "red";
	
	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}
}

public class PassByValue {
	
	public static void main(String[] args) {
		Apple apple = new Apple();
		System.out.println(apple.getColor());
 
		changeApple(apple);
		System.out.println(apple.getColor());
	}
 
	public static void changeApple(Apple apple){
		apple.setColor("green");
	}

}
