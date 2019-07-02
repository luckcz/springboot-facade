package com.mayikt.service;

import com.mayikt.service.IntegralService;
import com.mayikt.service.LogService;
import com.mayikt.service.MsgService;
import com.mayikt.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//采用 外观模式  包装模式  使用一个接口进行封装复杂业务逻辑流程，让客户使用起来更加简洁，代码可读性更高
@Component
public class PayFacade {
    @Autowired
    private LogService logService ;
    @Autowired
    private IntegralService integralService ;
    @Autowired
    private PayService payService ;
    @Autowired
    private MsgService msgService ;

    public void facadeCallback(){
        //第一步：日志收集
        logService.logService();
        //第二部：修改支付状态
        payService.updatePaymentStatus();
        //第三种：增加积分
        integralService.addIntegral();
        //第四部：调用消息服务平台
        msgService.msgService();
    }
}
