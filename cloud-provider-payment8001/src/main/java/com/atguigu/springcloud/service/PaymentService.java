package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName:PaymentService
 * @Auther: haojie Zhang
 * @Description: service
 * @Date: 2022/11/3 21:44
 * @Version: v1.0
 */
public interface PaymentService {
    public int create (Payment payment);
    public Payment getPaymentById(@Param("id")Long id);
}
