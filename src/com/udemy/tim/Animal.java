package com.udemy.tim;

public class Animal {
	private String name;
	private int brain;
	private int body;
	private int weight;
	
	public Animal(String name, int brain, int body, int weight) {
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.weight = weight;
	}
	
	public void eat() {
		System.out.println("Animal.eat() called");
	}

	public void move(int speed) {
		System.out.println("Animal.move() called Moving at speed "+speed);
	}
	
	public String getName() {
		return name;
	}

	public int getBrain() {
		return brain;
	}

	public int getBody() {
		return body;
	}

	public int getWeight() {
		return weight;
	}	
}