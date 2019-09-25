package com.duchong.designpattern.strategy;

/**
 * @author DUCHONG
 * @since 2019-09-24 18:28
 **/
public class VipOneStrategy implements Strategy {

    /**
     * vip1 不打折
     * @param originPrice
     * @return
     */
    @Override
    public double getVipPrice(double originPrice) {

        System.out.println("使用策略模式---不打折,原价");
        return originPrice;
    }
}
