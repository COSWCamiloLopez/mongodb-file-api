package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.model.User;

import java.util.List;

public interface TaskService {

    /**
     * @return
     */
    List<Task> geTasksList();

    /**
     * @param id
     * @return
     */
    Task getTaskById(String id);

    /**
     * @param userId
     * @return
     */
    List<Task> getTasksByUserId(String userId);

    /**
     * @param taskId
     * @param user
     */
    void assignedTaskToUser(String taskId, User user);

    /**
     *
     */
    void removeTask(String taskId);

    /**
     * @param task
     */
    void updateTask(Task task);

    /**
     * @param task
     */
    void createNewTask(Task task);
}
