package com.gsq.learning.tcc.order.service;

import com.gsq.learning.tcc.order.entity.Order;

/**
 * @author guishangquan
 * @date 2018/11/8
 */
public interface PaymentService {
    /**
     * 订单支付.
     *
     * @param order 订单实体
     */
    void makePayment(Order order);

    /**
     * mock订单支付的时候库存异常.
     *
     * @param order 订单实体
     * @return String
     */
    String mockPaymentInventoryWithTryException(Order order);

    /**
     * mock订单支付的时候库存超时.
     *
     * @param order 订单实体
     * @return String
     */
    String mockPaymentInventoryWithTryTimeout(Order order);
}
