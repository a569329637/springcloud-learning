package com.gsq.learning.tcc.order.client;

import com.gsq.learning.tcc.order.configuration.MyConfiguration;
import com.gsq.learning.tcc.order.dto.InventoryDTO;
import com.hmily.tcc.annotation.Tcc;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author guishangquan
 * @date 2018/11/8
 */
@FeignClient(value = "inventory-service", configuration = MyConfiguration.class)
public interface InventoryClient {

    /**
     * 库存扣减
     *
     * @param inventoryDTO 实体对象
     * @return true 成功
     */
    @RequestMapping("/inventory/decrease")
    @Tcc
    Boolean decrease(@RequestBody InventoryDTO inventoryDTO);

    /**
     * 获取商品库存
     *
     * @param productId 商品id
     * @return InventoryDO
     */
    @RequestMapping("/inventory/findByProductId")
    Integer findByProductId(@RequestParam("productId") String productId);

    /**
     * 模拟库存扣减异常
     *
     * @param inventoryDTO 实体对象
     * @return true 成功
     */
    @Tcc
    @RequestMapping("/inventory/mockWithTryException")
    Boolean mockWithTryException(@RequestBody InventoryDTO inventoryDTO);

    /**
     * 模拟库存扣减超时
     *
     * @param inventoryDTO 实体对象
     * @return true 成功
     */
    @Tcc
    @RequestMapping("/inventory/mockWithTryTimeout")
    Boolean mockWithTryTimeout(@RequestBody InventoryDTO inventoryDTO);
}
