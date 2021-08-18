package com.redbee.patrones.template;

public class Facebook extends Network{
    Facebook(String user, String pass) {
        super(user,pass);
    }


    @Override
    boolean logIn(String user, String pass) {
        System.out.println("\nChecking user's parameters");
        System.out.println("Name: " + this.user);
        System.out.print("Password: ");
        for (int i = 0; i < this.pass.length(); i++) {
            System.out.print("*");
        }
        System.out.println("\n\nLogIn success on Facebook");
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        boolean messagePosted = false;
        if (!messagePosted) {
            System.out.println("Message: '" + new String(data) + "' was posted on Facebook");
            messagePosted = true;
        }
        return messagePosted;
    }

    @Override
    void logOut() {
        System.out.println("User: '" + user + "' was logged out from Facebook");
    }
}
