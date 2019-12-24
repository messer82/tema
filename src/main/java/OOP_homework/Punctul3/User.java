package OOP_homework.Punctul3;

public class User {
    private String user;

    public String getUser() {
        return this.user;
    }

    public void setUser(String fUser) {
        this.user = fUser;
    }

    public void createUser() {
        User firstUser = new User();
        firstUser.setUser("John Doe");
        User secondUser = new User();
        secondUser.setUser("Jane Doe");
    }
}
