package org.myproject.taskmanagement.service;

import lombok.RequiredArgsConstructor;
import org.myproject.taskmanagement.document.Task;
import org.myproject.taskmanagement.exception.TaskNotFoundException;
import org.myproject.taskmanagement.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long taskId) {
        return taskRepository.findById(taskId).orElseThrow(()->new TaskNotFoundException("Task not found" + taskId));
    }
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }
    public Task updateTask(Long id, Task taskDetails) {
        Task task = taskRepository.findById(id).orElseThrow(()->new TaskNotFoundException("Task not found" + id));

        task.setTitle(taskDetails.getTitle());
        task.setDescription(taskDetails.getDescription());
        task.setPriority(taskDetails.getPriority());
        task.setStatus(taskDetails.getStatus());

        return taskRepository.save(task);

    }
    public void deleteTask(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(()->new TaskNotFoundException("Task not found" + id));
        taskRepository.deleteById(id);

    }
}
