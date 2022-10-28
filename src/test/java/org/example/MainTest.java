package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



    class MainTest {
        @Test
        void when_password_include_less_than_6(){
            int pass_length = 6;
            String password = "fjkslwi";
            boolean expected = true;
            boolean result = Main.long_password(password,pass_length);
            assertEquals(expected,result);
        }

        @Test
        void when_password_more_than_10_password_ok(){
            int pass_length = 10;
            String password = "jhkiunbvj";
            boolean expected = false;
            boolean result = Main.long_password(password,pass_length);
            assertEquals(expected,result);
        }
        @Test
        void when_password_include_number_password_ok(){
            String password = "mda7hg";
            boolean expected = true;
            boolean result = Main.pass_include_number(password);
            assertEquals(expected,result);
        }

        @Test
        void when_password_include_Upper_password_ok(){
            String password = "jHmnor";
            boolean expected = true;
            boolean result = Main.uper_lower_include(password);
            assertEquals(expected,result);
        }
        @Test
        void when_password_not_strong_password_bad(){
            String password ="matghjikjh";
            int length = 10;
            boolean expected = false;
            boolean result = Main.valid_password(password,length);
            assertEquals(expected,result);
        }


    }
