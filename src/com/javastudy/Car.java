package com.javastudy;

import java.util.Scanner;

public class Car {
	String name;
	int year;
	Scanner sc=new Scanner(System.in);
	
	public Car(){}
	
	public Car(String name, int year) {
		this.name=name;
		this.year=year;
	}
	
	public void prn(){
		System.out.println(name + "," + year);
	}

}
