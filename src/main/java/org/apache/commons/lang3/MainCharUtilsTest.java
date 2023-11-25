package org.apache.commons.lang3;

import org.apache.commons.lang3.CharUtils;

public class MainCharUtilsTest {
    public static void main(String[] args) {
        char a = '9';
        if(CharUtils.toChar(a) == '9'){
            System.out.println("Test1 passed");
        }
        else{
            System.out.println("Test1 failed");
        }

        char b='7';
        if(CharUtils.toIntValue(b) == 7){
            System.out.println("Test2 passed");
        }
        else{
            System.out.println("Test2 failed");
        }

        char c='a';
        if(CharUtils.isAscii(c) == true){
            System.out.println("Test3 passed");
        }
        else{
            System.out.println("Test3 failed");
        }
    }






}
