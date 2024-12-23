package com.practice.oops;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1= new Person();
		
		p1.setName("Ankur");
		String name1=p1.getName();
		System.out.println(name1);
	}

}

class Person {
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}
