package com.collections.practice;


// Model Class
public class Olives {
	public String name = "Simple";
	public long color = 0x2E0854;
	public int oil = 3;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getColor() {
		return color;
	}
	public void setColor(long color) {
		this.color = color;
	}
	public int getOil() {
		System.out.println("Ouch");
		return oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
}
