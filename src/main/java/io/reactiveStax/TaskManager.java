package io.reactiveStax;

import java.time.LocalDate;

public class TaskManager {
    public class TaskDetails{
        private String description;
        private LocalDate creationDate;
        private int priority;

        public TaskDetails(String description, LocalDate creationDate, int priority) {
            this.description = description;
            this.creationDate = creationDate;
            this.priority = priority;
        }

        public void displayDetails(){
            System.out.println("Task Description => "+description);
            System.out.println("Created on => "+creationDate);
            System.out.println("Priority => "+priority);
        }
    }

    public static class TaskUtils{
        public static int compareByPriority(TaskDetails t1, TaskDetails t2){
            return Integer.compare(t1.priority,t2.priority);
        }
    }

    public  TaskDetails createTask(String description, int priority){
        return new TaskDetails(description,LocalDate.now(),priority);
    }
}
