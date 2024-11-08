public class FirstLevel {
    private int id;
    private Status status;

    public FirstLevel(int id, Status status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public void showInfo() {
        System.out.println("First Level: ID = " + id + ", Status = " + status);
    }
}

