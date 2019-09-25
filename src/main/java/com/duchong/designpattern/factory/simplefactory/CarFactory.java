package com.duchong.designpattern.factory.simplefactory;

public class CarFactory {

	public static final String AUTO="奥迪";

	public static final String BYD="比亚迪";

	public static  Car createCar(String type){
		if(AUTO.equals(type)){
			return new Audi();
		}
		else if(BYD.equals(type)){

			return new Byd();
		}
		else{
			return null;
		}
	}

}
