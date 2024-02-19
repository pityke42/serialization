package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = null;
        FileInputStream fileIn = new FileInputStream("/home/pityke17/projects/java/serialization/userInfo.ser");
        ObjectInputStream objIn = new ObjectInputStream(fileIn);
        user = (User) objIn.readObject();
        objIn.close();
        fileIn.close();
        System.out.println(user.getName());
        System.out.println(user.getPassword());
    }
}
