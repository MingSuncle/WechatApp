package com.example.wechat.ticket;


import com.example.wechat.utils.R;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "购票信息")
@ApiSupport(order = 10)
@RestController
@RequestMapping("/ticket")
public class ticketController {

    @ApiOperation("查看所有门票信息")
    @GetMapping("/getInformation")
    public R getBoxByUserId(){
        R r = R.ok();
        return r;
    }
}
