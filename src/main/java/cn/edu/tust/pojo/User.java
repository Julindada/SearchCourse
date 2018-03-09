package cn.edu.tust.pojo;

import java.io.Serializable;

public class User implements Serializable{
    private int id;
    private String username;
    private String password;

    public User(){
        super();
    }

    public User(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
