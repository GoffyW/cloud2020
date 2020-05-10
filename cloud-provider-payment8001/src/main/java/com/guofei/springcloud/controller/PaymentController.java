package com.guofei.springcloud.controller;

import com.guofei.springcloud.entities.CommonResult;
import com.guofei.springcloud.entities.Payment;
import com.guofei.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author GoffyGUO
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody  Payment payment){
        int i = paymentService.create(payment);
        log.info("****插入数据*****"+i);
        if (i>0){
            return new CommonResult(200,"插入数据成功",i);
        }else{
            return new CommonResult(200,"插入数据成功",null);

        }
    }
    @GetMapping("/payment/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPayment(id);
        log.info("****查询数据*****");
        if (payment!=null){
            return new CommonResult(200, "查询数据成功", payment);
        }else{
            return new CommonResult(200, "查询数据为空,没有对应ID"+id, null);

        }
    }

}
