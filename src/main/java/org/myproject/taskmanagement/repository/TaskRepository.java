package org.myproject.taskmanagement.repository;

import org.myproject.taskmanagement.document.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<Task, Long> {
}
