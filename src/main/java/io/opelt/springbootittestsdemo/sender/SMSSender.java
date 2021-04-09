package io.opelt.springbootittestsdemo.sender;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;

import io.opelt.springbootittestsdemo.domain.Message;

@FeignClient(name = "smsClient", url = "${api.url}")
public interface SMSSender {

    @PostMapping(value = "/sms", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    SmsResponse send(Message message);
}
