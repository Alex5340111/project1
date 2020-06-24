package ru.ua.project1.repos;

import org.springframework.data.repository.CrudRepository;
import ru.ua.project1.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
