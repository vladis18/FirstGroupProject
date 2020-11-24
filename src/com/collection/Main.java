package com.collection;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
// int x=10;
//        for (int i = 0; i < 10; i++) {
//            System.out.println("hello");
//            String st="BIG";
//            System.out.println(st.toLowerCase());
//x++;
//        Accept username, password and confirm password from a user and check following requirements:
//        Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
//        Password should be minimum 8 characters, if less → message=”Password is too short”.
//        Password cannot contain username if so, → message=”Password cannot contain username”.
//        Password should match confirmed password, if not  → message=“Passwords do not match”.
//        Only after all requirements met → message “Your username and password has been created”
//
//        String userName2="Ha";
//        String passWord2="HAha";
//        String userName3="HelloWorld";
//        String passWord3="HelloWorld";
//        String userName4="WoldHello";
//        String passWord4="HelloWold4";


        Scanner scan = new Scanner(System.in);
        String   userName, passWord,userName1, passWord1,input ="";

        boolean created = false;
//
//        System.out.println("Please enter your new UserName");
//        userName = scan.nextLine();
//
//        System.out.println("Please enter your new Password");
//        passWord = scan.nextLine();
        //System.out.println(userName.equals(passWord));
       // if (userName.isEmpty());
       // System.out.println(userName.equals(passWord));
        //System.out.println("UserName = " + userName +  " Password = " + passWord);

//        if (userName.isEmpty() || passWord.isEmpty()) {
//            input = "empty";
//            System.out.println(userName.equals(passWord));
//            System.out.println("UserName = " + userName +  " Password = " + passWord);
//            System.out.println("both empty");
//        }
        do {
            System.out.println("Please enter your new UserName");
            userName = scan.nextLine();
         userName.charAt(0);
            System.out.println("Please enter your new Password");
            passWord = scan.nextLine();
            System.out.println("Please reenter your new Password");
            passWord1 = scan.nextLine();
            if (userName.isEmpty() || passWord.isEmpty()) {
                input = "empty";
            }
            else if (passWord.length() < 8) {
                input = "short";
            }
            else if (userName.equals(passWord)) {
                input = "same";
            }
            else if (!passWord.equals(passWord1)) {
                input = "mismatch";
            } else if ((passWord.equals(passWord1) && passWord.length() >= 8 && !userName.equals("") && !passWord.equals(""))) {
                input = "created";
            }
            switch (input) {
                case "empty":
                    System.out.println("Username and Password cannot be  empty");
                    break;
                case "short":
                    System.out.println("Password should be minimum 8 characters");
                    break;
                case "same":
                    System.out.println("Password cannot contain Username");
                    break;
                case "mismatch":
                    System.out.println("Passwords do not match");
                    break;
                case "created":
                    System.out.println("Your username and password has been created");
                    created = true;
                    break;

            }
        } while (!created) ;

    }
        }


