package com.equal;

public class Equality {
	
	public String name;
	public int id;
	
	
	public Equality(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equality other = (Equality) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public static void main(String[] args) {
		
		Equality e1 = new Equality("One", 1);
		Equality e2 = new Equality("Two", 2);
		
		if(e1.hashCode() == e2.hashCode()) {
			if(e1.equals(e2)) {
				System.out.println("Both the objects are equal..!!");
			} else {
				System.out.println("Both the objects are not equal..!!");
			}
		} else {
			System.out.println("Both the objects are equal..!!");
		}
	}

}
