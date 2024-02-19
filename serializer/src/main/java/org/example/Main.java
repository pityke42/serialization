package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.setName("megatron420");
        user.setPassword("lalababa");

        FileOutputStream fileOut = new FileOutputStream("userInfo.ser");
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
        objOut.writeObject(user);
        objOut.close();

        System.out.println("object info saved");

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);


    }
}