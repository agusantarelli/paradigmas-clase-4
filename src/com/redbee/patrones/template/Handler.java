package com.redbee.patrones.template;

import java.util.Scanner;

public class Handler {

    public static void main(String[] args){

        Network network = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input user name: ");
        String user = sc.nextLine();
        Scanner ps = new Scanner(System.in);
        System.out.print("Input password: ");
        String pass = ps.nextLine();

        // Enter the message.
        Scanner ms = new Scanner(System.in);
        System.out.print("Input message: ");
        String msg = ms.nextLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        Scanner ch = new Scanner(System.in);
        int choice = ch.nextInt();

        //Create proper network object
        switch (choice){
            case 1:
                network = new Facebook(user,pass);
                break;
            case 2:
                network = new Twitter(user,pass);
                break;
            default:
                break;
        }

        // Send the message.
        network.post(msg);
    }
}
