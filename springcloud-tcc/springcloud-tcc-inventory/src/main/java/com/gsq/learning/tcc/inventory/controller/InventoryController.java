package com.gsq.learning.tcc.inventory.controller;

import com.gsq.learning.tcc.inventory.dto.InventoryDTO;
import com.gsq.learning.tcc.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guishangquan
 * @date 2018/11/8
 */
@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    @Autowired
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @RequestMapping("/decrease")
    public Boolean decrease(@RequestBody InventoryDTO inventoryDTO) {
        return inventoryService.decrease(inventoryDTO);
    }

    @RequestMapping("/findByProductId")
    public Integer findByProductId(@RequestParam("productId") String productId) {
        return inventoryService.findByProductId(productId).getTotalInventory();
    }

    @RequestMapping("/mockWithTryException")
    public Boolean mockWithTryException(@RequestBody InventoryDTO inventoryDTO) {
        return inventoryService.mockWithTryException(inventoryDTO);
    }

    @RequestMapping("/mockWithTryTimeout")
    public Boolean mockWithTryTimeout(@RequestBody InventoryDTO inventoryDTO) {
        return inventoryService.mockWithTryTimeout(inventoryDTO);
    }
}
