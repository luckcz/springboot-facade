package com.mayikt.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MsgService {
    public void msgService(){
        log.info("第四个模块：发送消息服务.....");
    }
}
