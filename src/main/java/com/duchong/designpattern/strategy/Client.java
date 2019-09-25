package com.duchong.designpattern.strategy;

public class Client {


	public static void main(String[] args) {

		double originPrice=1000D;

		//使用策略模式之前
		System.out.println(CommonGetPrice.getVipPrice(CommonGetPrice.VIP1,originPrice));
		System.out.println(CommonGetPrice.getVipPrice(CommonGetPrice.VIP2,originPrice));
		System.out.println(CommonGetPrice.getVipPrice(CommonGetPrice.VIP3,originPrice));
		System.out.println(CommonGetPrice.getVipPrice(CommonGetPrice.VIP4,originPrice));


		//使用策略模式之后
		VipContext vipContext=new VipContext();

		Strategy v1=new VipOneStrategy();
		vipContext.setStrategy(v1);
		System.out.println(vipContext.getVipPrice(originPrice));

		Strategy v2=new VipTwoStrategy();
		vipContext.setStrategy(v2);
		System.out.println(vipContext.getVipPrice(originPrice));

		Strategy v3=new VipThreeStrategy();
		vipContext.setStrategy(v3);
		System.out.println(vipContext.getVipPrice(originPrice));

		Strategy v4=new VipFourStrategy();
		vipContext.setStrategy(v4);
		System.out.println(vipContext.getVipPrice(originPrice));

	}
}
