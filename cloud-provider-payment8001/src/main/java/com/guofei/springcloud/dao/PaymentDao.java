package com.guofei.springcloud.dao;

import com.guofei.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author GoffyGUO
 */
@Mapper
public interface PaymentDao {
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
    Payment getPayment(@Param("id") Long id);

}
