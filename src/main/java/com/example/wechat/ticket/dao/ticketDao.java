package com.example.wechat.ticket.dao;


import com.example.wechat.ticket.entity.ticketEntity;
import com.github.jeffreyning.mybatisplus.base.MppBaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ticketDao extends MppBaseMapper<ticketEntity> {
    Integer verificationTicket(Integer ticketId);
}
