package io.opelt.springbootittestsdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.opelt.springbootittestsdemo.domain.Message;

public interface MessageRepository extends JpaRepository<Message, String> {
}
