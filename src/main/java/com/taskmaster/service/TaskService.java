package com.taskmaster.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.taskmaster.entity.Task;
import com.taskmaster.repository.TaskRepository;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    
    
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    
    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Optional<Task> findById(Long id) {
        return taskRepository.findById(id);
    }

    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }

}
