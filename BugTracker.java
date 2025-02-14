import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//  We need to store bugs, track history, update user through notifications, add new bugs, add comments, print bugs and comments and display history and notifications


public class BugTracker {
   private ArrayList<Bug> bugList; //to store all bugs, also new incoming ones
private Stack<String> history; //to track changes, store history
private Queue<String> notifications; // to notify about new bugs


public BugTracker() {
    this.bugList = new ArrayList<>();
    this.history = new Stack<>();
    this.notifications = new LinkedList<>();
}
 
public void addBug(int id, String title, String des, String status, String priority){
Bug newBug = new Bug(id, title, des, status, priority);
bugList.add(newBug);
history.push("Added Bug with ID:-"+id);
notifications.add("New bug found:-"+title);
}

public void updateStatus(int id, String newStatus){
    for(Bug bug : bugList){
        if(bug.getId() == id){
            history.push("Bug ID:- "+id+" status updated from "+bug.getStatus()+" to "+newStatus);
            notifications.add("Bug ID:- " + id+" status changed to "+ newStatus);
            return;
        } 
    }
    System.out.println("BUG ID NOT FOUND!!");
}

public void addComments(int id, String comments){
    for(Bug bug :bugList){
        if(bug.getId()==id){
            bug.addComments(comments);
            history.push("Added comment to Bug ID:- "+id);
            notifications.add("New comment add to Bug ID:- "+id);
            return;
        }
    }
    System.out.println("BUG ID NOT FOUND!!");
}

public void viewBugs(){
    for(Bug bug :bugList){
        System.out.println(bug);
        System.out.println("Comments:- "+ bug.getComments());
}
}
public void viewHistory(){
    for(Bug bug :bugList){
        while (history.isEmpty()) {
            System.out.println(history.pop());
        }
    }
}
public void viewNotifications(){
   
        while (!notifications.isEmpty()) {
            System.out.println(notifications.poll());     
        }
    
}
}


