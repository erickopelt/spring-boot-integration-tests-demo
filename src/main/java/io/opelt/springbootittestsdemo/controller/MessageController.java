package io.opelt.springbootittestsdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.opelt.springbootittestsdemo.domain.Message;
import io.opelt.springbootittestsdemo.service.MessageService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/messages")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService service;

    @PostMapping
    ResponseEntity<Message> create(@RequestBody Message message) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(message));
    }
}
