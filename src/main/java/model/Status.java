package model;

public enum Status {
    PENDING("Task peding"),
    CANCELED("Task canceled"),
    DONE("Task done");

    private String taskStatus;

    Status(String status) {
        this.taskStatus = status;
    }
}
