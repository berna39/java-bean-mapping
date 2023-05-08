package dto;

import model.Status;

public class TodoDto {

    private String title;
    private String detail;
    private Status status;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TodoDto{" +
                "title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                ", status=" + status +
                '}';
    }
}
