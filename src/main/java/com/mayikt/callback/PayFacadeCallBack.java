package com.mayikt.callback;

import com.mayikt.service.PayFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PayFacadeCallBack {
    @Autowired
    private PayFacade payFacade ;

    public void callBack(){
        payFacade.facadeCallback();
    }
}
