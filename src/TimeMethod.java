import java.time.LocalTime;

public class TimeMethod {
    public LocalTime time() {
        int i = 0;
        LocalTime now = LocalTime.now();
        if (now.equals(12)) {
            System.out.println("GOOD AFTERNOON " + User.getFullName());
        } else {
            System.out.println("GOOD MORNING" + User.getFullName());
        }
        return now;
    }
}
