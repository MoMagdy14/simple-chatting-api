package com.iti.chatting.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatRequestDto {
    private String topic;
    private String password;
}
