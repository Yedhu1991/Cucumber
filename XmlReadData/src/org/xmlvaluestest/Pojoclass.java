package org.xmlvaluestest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pojoclass {
	private int id;
	private String name;
	private long mob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}

}
