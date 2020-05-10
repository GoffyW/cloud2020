package com.guofei.springcloud.service;

import com.guofei.springcloud.entities.Payment;

/**
 * @author GoffyGUO
 */

public interface PaymentService {
    /**
     * 保存
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 获取
     * @param id
     * @return
     */
    Payment getPayment(Long id);
}
