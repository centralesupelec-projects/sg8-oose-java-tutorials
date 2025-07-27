package fr.cs.oose.pr3.ex2;

public class User {
    private String firstname;
    private String lastname;
    private String username;

    public User(String firstname, String lastname, String username) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String toString() {
        return "User - firstname: " + firstname + " - lastname: " + lastname + " - username: " + username;
    }
}
