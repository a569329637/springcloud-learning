package com.gsq.learning.tcc.account.service;

import com.gsq.learning.tcc.account.dto.AccountDTO;
import com.gsq.learning.tcc.account.entity.AccountDO;
import com.hmily.tcc.annotation.Tcc;

/**
 * @author guishangquan
 * @date 2018/11/8
 */
public interface AccountService {
    /**
     * 扣款支付.
     *
     * @param accountDTO 参数dto
     * @return true
     */
    @Tcc
    boolean payment(AccountDTO accountDTO);

    /**
     * 获取用户账户信息.
     * @param userId 用户id
     * @return AccountDO
     */
    AccountDO findByUserId(String userId);
}
