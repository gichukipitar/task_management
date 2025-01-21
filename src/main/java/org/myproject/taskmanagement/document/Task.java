package org.myproject.taskmanagement.document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "tasks")
@Getter
@Setter
@NoArgsConstructor
public class Task {
    @Id
    private Long id;
    private String title;
    private String description;
    private String status;
    private String priority;
}
