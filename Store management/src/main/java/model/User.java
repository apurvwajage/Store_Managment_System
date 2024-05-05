package src.main.java.model;


public class User {
    private String username, fullName, password, contact_no, accessLevel;

    public User(String username, String fullName, String password, String contact_no, String accessLevel) {
        this.username = username;
        this.fullName = fullName;
        this.password = password;
        this.contact_no = contact_no;
        this.accessLevel = accessLevel;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public Object getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
    public String getContact() {
        return contact_no;
    }

    
}