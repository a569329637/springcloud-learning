package com.gsq.learning.tcc.order.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author guishangquan
 * @date 2018/11/8
 */
@Data
public class InventoryDTO implements Serializable {

    private static final long serialVersionUID = 8229355519336565493L;

    /**
     * 商品id.
     */
    private String productId;


    /**
     * 数量.
     */
    private Integer count;
}
