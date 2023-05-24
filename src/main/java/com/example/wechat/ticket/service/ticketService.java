package com.example.wechat.ticket.service;


import com.example.wechat.ticket.entity.ticketEntity;
import com.github.jeffreyning.mybatisplus.service.IMppService;

public interface ticketService extends IMppService<ticketEntity> {
    Integer verificationTicket(Integer ticketId);
}
