package org.example;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String password;
    public void hello(){
        System.out.println("hello");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
