package com.example.wechat.ticket.controller;


import com.example.wechat.ticket.form.gatePostForm;
import com.example.wechat.utils.R;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "闸机核销")
@ApiSupport(order = 10)
@RestController
@RequestMapping("/cechengcallback")
public class gateVerification {
    @ApiOperation("核销")
    @PostMapping("/usedticketscallback")
    public R callBack(@RequestBody  gatePostForm gatePostForm){
        R r = R.ok();
        System.out.println(gatePostForm);
        return r;
    }
}
