package com.app.fruit;

import java.util.Scanner;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;

	public Fruit() {

	}

	public Fruit( String name, boolean isFresh) {
//		this.color = color;
//		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public String taste() {
		return "no specific taste";

	}
    
	
	public static Scanner sc = new Scanner(System.in);
    public void accept() {
//    	System.out.println("Enter name");
//    	this.name = sc.nextLine();
    	System.out.println("Enter weight");
    	this.weight = sc.nextDouble();
    	System.out.println("Enter color");
    	this.color = sc.nextLine();
    	sc.nextLine();
    }
    
	public void display() {
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.weight);
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	public boolean getFresh() {
		return this.isFresh;
	}
    
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
    
	
}
