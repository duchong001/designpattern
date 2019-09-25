package com.duchong.designpattern.strategy;

/**
 * 实现起来比较容易，符合一般开发人员的思路
 * 假如，类型特别多，算法比较复杂时，整个条件语句的代码就变得很长，难于维护。
 * 如果有新增类型，就需要频繁的修改此处的代码！
 * 不符合开闭原则！
 * @author DUCHONG
 *
 */
public class CommonGetPrice {

	public static final String VIP1="v1";
	public static final String VIP2="v2";
	public static final String VIP3="v3";
	public static final String VIP4="v4";

	/**
	 * 获取vip的价格
	 * @param type vip类型
	 * @param price 原价格
	 * @return
	 */
	public static double getVipPrice(String type, double price) {

		if (type.equals(VIP1)) {
			System.out.println("不使用策略模式---不打折,原价");
			return price;
		}
		else if (type.equals(VIP2)) {
			System.out.println("不使用策略模式---打九折");
			return price * 0.9;
		}
		else if (type.equals(VIP3)) {
			System.out.println("不使用策略模式---打八五折");
			return price * 0.85;
		}
		else if (type.equals(VIP4)) {
			System.out.println("不使用策略模式---打八折");
			return price * 0.8;
		}
		return price;
	}

}
