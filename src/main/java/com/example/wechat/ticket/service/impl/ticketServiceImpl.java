package com.example.wechat.ticket.service.impl;


import com.example.wechat.ticket.dao.ticketDao;
import com.example.wechat.ticket.entity.ticketEntity;
import com.example.wechat.ticket.service.ticketService;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
import org.springframework.stereotype.Service;

@Service("ticketService")
public class ticketServiceImpl extends
        MppServiceImpl<ticketDao, ticketEntity> implements ticketService {
    @Override
    public Integer verificationTicket(Integer ticketId) {
        return baseMapper.verificationTicket(ticketId);
    }
}
