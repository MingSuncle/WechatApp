package com.example.wechat.ticket.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
@TableName("ticket")
public class ticketEntity {
    @TableId("ticket_id")
    private Integer ticketId;

    @TableField("ticket_type")
    private String tickerType;

    @TableField("ticket_price")
    private Integer ticketPrice;

    @TableField("deadline")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date deadline;

}
