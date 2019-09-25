package com.duchong.designpattern.strategy;

/**
 * @author DUCHONG
 * @since 2019-09-24 18:28
 **/
public class VipTwoStrategy implements Strategy{

    @Override
    public double getVipPrice(double originPrice) {
        System.out.println("使用策略模式---打九折");
        return originPrice * 0.9;
    }
}
