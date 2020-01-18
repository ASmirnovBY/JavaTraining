package by.smirnov.task10.task2.utils.request;

public class Response {
    private String status;
    private Object obj;

    public Response(String status) {
        this.status = status;
    }

    public Response(String status, Object obj) {
        this.status = status;
        this.obj = obj;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
