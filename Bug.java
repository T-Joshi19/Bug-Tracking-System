import java.util.ArrayList;

class Bug{
    //assigning attributes for storing details
    private int id;
    private String title;
    private String des;
    private String status; //open, in progress or closed
    private String priority; //low,medium, high

    ArrayList<String> comments = new ArrayList<>();
    
    public Bug(int id, String title, String des, String status, String priority) {
        this.id = id;
        this.title = title;
        this.des = des;
        this.status = status;
        this.priority = priority;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public ArrayList<String> getComments() {
        return comments;
    }

    public void addComments(String comments) {
        this.comments.add(comments);
    }
    public String toString(){
        return "ID:"+ id + " ,Title:"+title+" ,Status:"+status+" ,Priority:"+ priority;
    }
    
}