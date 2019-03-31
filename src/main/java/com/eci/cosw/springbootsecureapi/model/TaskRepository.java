package com.eci.cosw.springbootsecureapi.model;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface TaskRepository extends MongoRepository<Task, String> {

    List<Task> findByOwner(String owner);

    List<Task> findByResponsible(Long responsible);

    List<Task> findByDueDate(Date dueDate);

    List<Task> findByStatus(String status);

}