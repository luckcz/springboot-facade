package com.mayikt.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class IntegralService {
    public void addIntegral(){
        log.info("第三个模块：积分增加了.......");
    }
}
