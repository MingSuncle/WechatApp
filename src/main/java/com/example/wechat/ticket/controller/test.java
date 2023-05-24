package com.example.wechat.ticket.controller;



import com.example.wechat.utils.R;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "测试")
@ApiSupport(order = 10)
@RestController
@RequestMapping("/test")
public class test {
    @ApiOperation("test")
    @GetMapping("/test")
    public R test(){
        R r = R.ok();
        r.put("status",0);
        r.put("msg","");
        return r;
    }
}
