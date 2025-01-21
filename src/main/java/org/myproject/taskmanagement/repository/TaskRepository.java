package org.myproject.taskmanagement.repository;

import org.myproject.taskmanagement.document.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
