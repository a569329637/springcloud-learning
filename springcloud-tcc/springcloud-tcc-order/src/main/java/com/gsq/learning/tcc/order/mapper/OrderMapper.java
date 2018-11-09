package com.gsq.learning.tcc.order.mapper;

import com.gsq.learning.tcc.order.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

/**
 * @author guishangquan
 * @date 2018/11/8
 */
public interface OrderMapper {

    /**
     * 保存订单.
     *
     * @param order 订单对象
     * @return rows
     */
    @Insert(" insert into `order` (create_time,number,status,product_id,total_amount,count,user_id) "
            + " values ( #{createTime},#{number},#{status},#{productId},#{totalAmount},#{count},#{userId})")
    int save(Order order);

    /**
     * 更新订单.
     *
     * @param order 订单对象
     * @return rows
     */
    @Update("update `order` set status = #{status} , total_amount=#{totalAmount} where number=#{number}")
    int update(Order order);
}
