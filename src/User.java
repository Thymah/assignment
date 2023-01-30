public class User {

    static String playerName;
    static String firstName;
    static String secondName;
    static String fullName;
    char c = '*';
    String str = new String(String.valueOf(c));

    User(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        fullName = firstName + " " + secondName;
    }


    public static String getFullName() {
        return
                fullName = firstName + " " + secondName;
    }
    User(String s){
        this.playerName = s;
        if(s.length() != 8 && !s.contains("*")) {
            System.out.println("Your user name is not valid. It most contain at least 8 characters with '*'");
        }

}
}
