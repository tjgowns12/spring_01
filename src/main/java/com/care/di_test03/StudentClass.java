package com.care.di_test03;

import java.util.ArrayList;

public class StudentClass implements Student{
	private PrintClass pc;
	private String name;
	private ArrayList<String> food;
	
	public StudentClass() {}
	public StudentClass(String name) {
		this.name=name;
	}
	public PrintClass getPc() {
		return pc;
	}
	public void setPc(PrintClass pc) {
		this.pc = pc;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getFood() {
		return food;
	}
	public void setFood(ArrayList<String> food) {
		this.food = food;
	}
	@Override
	public void execute() {
		pc.printFunc(this.name, this.food);
		
	}
	
	
}
