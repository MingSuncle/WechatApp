package com.example.wechat.ticket.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
public class gatePostForm {
    private String msg;
    private String serialNo;
    private String uid;
    private String password;
    private String status;
    private String usedCount;
    private String usedTime;
    private String sign;

    @Data
    @Builder

    public static class usetickets{
        @JsonProperty("authCode")
        private String authCode;

        @JsonProperty("count")
        private String count;
    }
}
