package com.mayikt.controller;

import com.mayikt.callback.PayFacadeCallBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacadeController {
    @Autowired
    private PayFacadeCallBack payFacadeCallBack ;

    @RequestMapping("/pay")
    public String pay(){
        payFacadeCallBack.callBack();
        return "success";
    }
}
