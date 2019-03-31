package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.model.User;
import com.eci.cosw.springbootsecureapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@RestController
@CrossOrigin("*")
@RequestMapping(value = "api/task")
public class TaskAPIController {

    @Autowired
    TaskService taskService;


    /**
     * @return
     */
    @GetMapping("/all")
    @ResponseBody
    public List<Task> getTasksList() {
        return taskService.geTasksList();
    }

    /**
     * @param taskId
     * @return
     */
    @GetMapping("{taskId}")
    @ResponseBody
    public Task getTaskById(@PathVariable("taskId") String taskId) {
        return taskService.getTaskById(taskId);
    }

    /**
     * @param userId
     * @return
     */
    @GetMapping("/user/{userId}")
    @ResponseBody
    public List<Task> getTasksByUserId(@PathVariable("userId") String userId) {
        return taskService.getTasksByUserId(userId);
    }

    /**
     * @param user
     * @param taskId
     */
    @PutMapping("/assign/{taskId}")
    public void assignTaskToUser(@RequestBody User user, @PathVariable("taskId") String taskId) {
        taskService.assignedTaskToUser(taskId, user);
    }

    /**
     * @param taskId
     */
    @DeleteMapping("/delete/{taskId}")
    public void removeTask(@PathVariable("taskId") String taskId) {
        taskService.removeTask(taskId);
    }

    /**
     * @param task
     */
    @PutMapping("/update")
    public void updateTask(@RequestBody Task task) {
        taskService.updateTask(task);
    }

    /**
     * @param task
     */
    @PostMapping("/newtask")
    public void createNewTask(@RequestBody Task task) {
        taskService.createNewTask(task);
    }
}
