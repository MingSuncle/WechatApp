package com.example.wechat.ticket.controller;


import com.example.wechat.ticket.service.ticketService;
import com.example.wechat.utils.R;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "购票信息")
@ApiSupport(order = 10)
@RestController
@RequestMapping("/ticket")
public class ticketController {
    private final ticketService ticketService;

    public ticketController(com.example.wechat.ticket.service.ticketService ticketService) {
        this.ticketService = ticketService;
    }

    @ApiOperation("查看所有门票信息")
    @GetMapping("/getInformation")
    public R getTicket(){
        R r = R.ok();
        return r;
    }


    /**
     * 使用二维码核销票Test
     */

    @ApiOperation("核销")
    @GetMapping("/test")
    public R test(@RequestParam(value = "ticket_id")Integer ticketId){
        R r = R.ok();
        Integer result = ticketService.verificationTicket(ticketId);
        r.addData("result",result);
        return r;
    }
}
