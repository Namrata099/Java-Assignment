package com.bird;

public class Bird {
	private int id = 1;
	private static String name = "Peacock";
	private float distance = 15;
	private double weight = 23;
	private boolean canFly = true;

	public Bird(int id, float distance, double weight, boolean canFly) {
		super();
		this.id = id;
		this.distance = distance;
		this.weight = weight;
		this.canFly = canFly;
	}

	public Bird() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Bird.name = name;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	public void fly() {
		System.out.println("This bird can fly");
	}

	@Override
	public String toString() {
		return "Bird [id=" + id + ", distance=" + distance + ", weight=" + weight + ", canFly=" + canFly + "]";
	}

}
