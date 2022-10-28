package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password = "";
        int length = 10;


        if(valid_password(password,length)){
            System.out.println("password is good");
        }else{
            System.out.println("password is not good");
        }

        String numbers_letters="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=*])(?=\\S+$).{8,}$";

        System.out.println(strong_password(password,numbers_letters));
    }
    public static boolean long_password(String password,int length){
        return password.length()>=length;
    }

    public static boolean pass_include_number(String password

    ){

        int countNum = 0;
        for (int i = 0; i < password.length(); i++) {
            if(password.charAt(i)>='0'&&password.charAt(i)<='9'){
                countNum++;
            }
        }
        // password include number
        return countNum>0;
    }
    public static boolean uper_lower_include(String password){
        //return str.matches(".*[a-z].*[A-Z].*");

        int countUp = 0;
        int countDown = 0;
        for (int i = 0; i < password.length(); i++) {

            if(password.charAt(i)>='a'&&password.charAt(i)<='z'){
                countUp++;
            }
            //Character.isUpperCase(str.charAt(i))
            if(password.charAt(i)>='A'&&password.charAt(i)<='Z'){
                countDown++;
            }
        }
        return countUp>0&&countDown>0;
    }



    public static boolean valid_password(String password, int length) {
        boolean longpassword = long_password(password,length);
        boolean include_number = pass_include_number(password);
        boolean include_uper_lower = uper_lower_include(password);

        return longpassword&&include_number&&include_uper_lower;
    }

    public static boolean strong_password(String password,String numbers_letters) {
        return password.matches(numbers_letters);
    }
}