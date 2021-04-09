package io.opelt.springbootittestsdemo.service;

import org.springframework.stereotype.Service;

import io.opelt.springbootittestsdemo.domain.Message;
import io.opelt.springbootittestsdemo.repository.MessageRepository;
import io.opelt.springbootittestsdemo.sender.SMSSender;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final MessageRepository repository;
    private final SMSSender smsSender;

    public Message create(Message message) {
        return repository.save(message);
    }
}
