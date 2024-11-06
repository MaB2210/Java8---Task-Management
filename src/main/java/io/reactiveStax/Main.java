package io.reactiveStax;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager =  new TaskManager();

        TaskManager.TaskDetails task1 = taskManager.createTask("Inner class working",1);
        task1.displayDetails();

        TaskManager.TaskDetails task2 = taskManager.createTask("One more task",3);
        int comparisionResult = TaskManager.TaskUtils.compareByPriority(task1,task2);
        System.out.println("Comparision Result => "+comparisionResult);

        Runnable taskProcessor = new Runnable() {
            @Override
            public void run() {
                System.out.println("Processing tasks in the background.....");
                task1.displayDetails();
                task2.displayDetails();
            }
        };

        new Thread(taskProcessor).start();
    }
}