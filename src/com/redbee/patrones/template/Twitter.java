package com.redbee.patrones.template;

public class Twitter extends Network {
    Twitter(String user, String pass) {
        super(user, pass);
    }

    @Override
    boolean logIn(String user, String pass) {
        System.out.println("\nChecking user's parameters");
        System.out.println("Name: " + this.user);
        System.out.print("Password: ");
        for (int i = 0; i < this.pass.length(); i++) {
            System.out.print("*");
        }
        System.out.println("\n\nLogIn success on Twitter");
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        boolean messagePosted = false;
        if (messagePosted) {
            System.out.println("Message: '" + new String(data) + "' was posted on Twitter");
            messagePosted = true;
        }else{
            System.out.println("Cannot post it!");
        }
        return messagePosted;
    }

    @Override
    void logOut() {
        System.out.println("User: '" + user + "' was logged out from Twitter");
    }
}
