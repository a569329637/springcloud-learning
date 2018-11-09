package com.gsq.learning.tcc.order.client;

import com.gsq.learning.tcc.order.configuration.MyConfiguration;
import com.gsq.learning.tcc.order.dto.AccountDTO;
import com.hmily.tcc.annotation.Tcc;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author guishangquan
 * @date 2018/11/8
 */
@FeignClient(value = "account-service", configuration = MyConfiguration.class)
public interface AccountClient {
    /**
     * 用户账户付款
     *
     * @param accountDO 实体类
     * @return true 成功
     */
    @PostMapping("/account/payment")
    @Tcc
    Boolean payment(@RequestBody AccountDTO accountDO);


    /**
     * 获取用户账户信息
     *
     * @param userId 用户id
     * @return AccountDO
     */
    @PostMapping("/account/findByUserId")
    BigDecimal findByUserId(@RequestParam("userId") String userId);
}
