package com.mayikt.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PayService {
    public void updatePaymentStatus(){
      log.info("第二个模块：支付状态修改......");
    }
}
