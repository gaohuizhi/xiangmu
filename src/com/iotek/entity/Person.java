package com.iotek.entity;

public class Person {
	private Integer id;
	private String name;
	private double money;
	private int age;
	private Address address;
	
	public Person(int age,String name, double money) {
		super();
		this.name = name;
		this.money = money;
		this.age = age;
	}

	public Person() {
		super();
	}

	public Person(Integer id, String name, double money) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", money=" + money + ", age=" + age + ", address=" + address
				+ "]";
	}

	

}
