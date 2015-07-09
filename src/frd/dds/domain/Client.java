package frd.dds.domain;

import frd.dds.util.DataGenerator;

public class Client {
	private Long id;
	private String name;
	private String address;
	
	public Client(){
		this.id = System.currentTimeMillis();
		this.name = DataGenerator.getPersonName();
		this.address = DataGenerator.getAddress();
	}

	public Client(String name, String address) {
		this.id = System.currentTimeMillis();
		this.name = name;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
