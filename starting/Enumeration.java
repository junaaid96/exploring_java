
class User {
    String username;
    private int pass;

    User(String username, int pass) {
        this.username = username;
        this.pass = pass;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        result = prime * result + pass;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        if (pass != other.pass)
            return false;
        return true;
    }

}

enum Status {
    Running,
    Pending,
    Failed,
    Success
}

public class Enumeration {
    public static void main(String arg[]) {

        Status statuses[] = Status.values();

        for (Status status : statuses) {
            // System.out.println(status + ": " + status.ordinal());
        }

        // User registration
        User registered_user1 = new User("junaid", 123456);

        // User login
        User login_user1 = new User("junaid", 123456);

        Status login_status = registered_user1.equals(login_user1) ? Status.Success : Status.Failed;

        System.out.println(login_status + "! ");

        if (login_status == Status.Success)
            System.out.println("Welcome, " + registered_user1.username);

    }
}
