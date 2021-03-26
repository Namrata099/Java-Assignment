package com.bird;

public class TestBird {

	private static Bird bird = new Bird(1, 12, 20, true);
	
	public static void main(String[] args) {
		
		Bird bird = new Bird();
		bird.getId();
		bird.getDistance();
		bird.getWeight();
		bird.isCanFly();
		
		System.out.println(Bird.getName());
		bird.fly();
		
		System.out.println(bird);
		System.out.println(TestBird.bird);
	}

}
