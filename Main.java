public class Main {
    public static void main(String[] args) {
        BugTracker bugTracker= new BugTracker();
        bugTracker.addBug(1, "Login issue", "Wrong email id", "close", "high");
        bugTracker.addBug(2, "Response issue", "Submit button doesn't respond", "open", "Crictical");
 
        bugTracker.updateStatus(1,"open" );

        bugTracker.addComments(1, "will be sorted soon");

        System.out.println("All bugs");
        bugTracker.viewBugs();

        System.out.println("History");
        bugTracker.viewHistory();

        System.out.println("Notifications");
        bugTracker.viewNotifications();
    }
}
