package com.WUSE.Distance;

public class Centimeter extends A_distance {

	public Centimeter(float value){
		super(100f,value);	//calls super constructor to set the baseRate
	}
	
	public Centimeter(){
		this(0f);	//generates a new meter object with value 0
	}

}